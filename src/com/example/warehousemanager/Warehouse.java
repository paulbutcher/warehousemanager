package com.example.warehousemanager;

public interface Warehouse {
    boolean hasInventory(String product, int quantity);
    void remove(String product, int quantity);
}
