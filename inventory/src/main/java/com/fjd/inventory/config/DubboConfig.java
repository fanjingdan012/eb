package com.fjd.inventory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:dubbo/*-provider.xml"})
public class DubboConfig {
}
