package com.example.warehousemanager;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.warehousemanager.WarehouseManagerTest \
 * com.example.warehousemanager.tests/android.test.InstrumentationTestRunner
 */
public class WarehouseManagerTest extends ActivityInstrumentationTestCase2<WarehouseManager> {

    public WarehouseManagerTest() {
        super("com.example.warehousemanager", WarehouseManager.class);
    }

}
