package com.xin.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.xin")
@MapperScan("com.xin.mapper")
public class QueryDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(QueryDemoApplication.class, args);
    }

}
