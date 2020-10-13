package com.fjd.inventory.service;

import org.junit.Assert;
import org.junit.Test;

public class InventoryServiceImplTest {
    InventoryServiceImpl inventoryServiceImpl = new InventoryServiceImpl();

    @Test
    public void testGetInventory() throws Exception {
        String result = inventoryServiceImpl.getInventory("id");
        Assert.assertEquals("get inventory id", result);
    }
}

