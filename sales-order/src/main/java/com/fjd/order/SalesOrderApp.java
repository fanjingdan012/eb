package com.fjd.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan({"com.fjd.order.mapper"})
public class SalesOrderApp {
    public static void main(String[] args) {

        new SpringApplicationBuilder(SalesOrderApp.class).web(WebApplicationType.SERVLET).run(args);
    }
}
