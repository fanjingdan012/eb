package com.fjd.order.controller;


import com.fjd.InventoryService;
import com.fjd.order.mapper.SalesOrderMapper;
import com.fjd.order.model.SalesOrder;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SalesOrderController {

    @Autowired
    private SalesOrderMapper salesOrderMapper;


    @DubboReference(
            interfaceName = "com.fjd.InventoryService",
            registry = "multicast://224.5.6.7:1234",
            timeout = 60000,
            check = false,
            url = "dubbo://localhost:20880"
    )

    private InventoryService inventoryService;

//    @Autowired
//    private Registration registration;// 服务注册
//    @Autowired
//    private DiscoveryClient client;


//    @GetMapping("/user")
//    public Authentication user(Authentication user) {
//        return user;
//    }

    @GetMapping("/SalesOrders")
    public List<SalesOrder> list() throws Exception {
        return salesOrderMapper.selectSalesOrders();
    }

    @GetMapping("/getInventory")
    public Response getInventory() {
        System.out.println("called getInventory");
        // Executing remote methods
        String hello = inventoryService.getInventory("world");
        Response response = new Response();
        response.result = hello;
        System.out.println("called getInventory" + hello);
        return response;
    }
}
