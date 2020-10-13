package com.fjd.inventory.controller;


import com.fjd.inventory.mapper.InventoryMapper;
import com.fjd.inventory.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
public class InventoryController {

    @Autowired
    private InventoryMapper inventoryMapper;


    @GetMapping("/Inventorys")
    public List<Inventory> list() {
        return inventoryMapper.selectAll();
    }
}
