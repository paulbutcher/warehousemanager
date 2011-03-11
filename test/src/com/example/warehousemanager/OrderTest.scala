package com.example.warehousemanager;

import junit.framework.TestCase
import com.borachio.junit3.MockFactory

class OrderTest extends TestCase with MockFactory {
  
  override def setUp() {
    super.setUp
    resetExpectations
  }
  
  override def tearDown() {
    verifyExpectations
    super.tearDown
  }

  def testInStock() {
    val mockWarehouse = mock[Warehouse]
    inSequence {
      mockWarehouse expects 'hasInventory withArguments ("Talisker", 50) returning true once;
      mockWarehouse expects 'remove withArguments ("Talisker", 50) once
    }
    
    val order = new Order("Talisker", 50)
    order.fill(mockWarehouse)
    
    assert(order.isFilled)
  }

  def testOutOfStock() {
    val mockWarehouse = mock[Warehouse]
    mockWarehouse expects 'hasInventory returns false once
    
    val order = new Order("Talisker", 50)
    order.fill(mockWarehouse)
    
    assert(!order.isFilled)
  }
}
