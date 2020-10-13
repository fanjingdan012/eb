package com.fjd.inventory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan({"com.fjd.inventory.mapper"})
public class InventoryApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(InventoryApp.class).web(WebApplicationType.SERVLET).run(args);
    }
}
