package com.xiangql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("com.xiangql.*")
public class LuckMain {
    public static void main(String[] args) {
        SpringApplication.run(LuckMain.class, args);
        
    }
}