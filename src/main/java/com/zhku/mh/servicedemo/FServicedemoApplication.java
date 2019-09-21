package com.zhku.mh.servicedemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class FServicedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FServicedemoApplication.class, args);
    }

}
