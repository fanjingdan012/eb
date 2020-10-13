package com.fjd.inventory.service;

import com.fjd.InventoryService;

public class InventoryServiceImpl implements InventoryService {
  public String getInventory(String id) {
    return "get inventory " + id;
  }
}
