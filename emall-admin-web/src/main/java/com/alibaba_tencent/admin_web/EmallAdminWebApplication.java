package com.alibaba_tencent.admin_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmallAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallAdminWebApplication.class, args);
    }

}
