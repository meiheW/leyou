package com.leyou.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author meihewang
 * @date 2020/04/12  17:25
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class PageInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PageInitializer.class, args);
    }

}
