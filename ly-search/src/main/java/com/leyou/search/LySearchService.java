package com.leyou.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author meihewang
 * @date 2020/03/01  1:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LySearchService {

    public static void main(String[] args) {
        SpringApplication.run(LySearchService.class, args);
    }
}