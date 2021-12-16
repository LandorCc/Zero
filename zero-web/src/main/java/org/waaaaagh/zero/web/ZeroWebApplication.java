package org.waaaaagh.zero.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author waaaaagh
 * @since 2021/12/15 15:03
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ZeroWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZeroWebApplication.class, args);
    }
}
