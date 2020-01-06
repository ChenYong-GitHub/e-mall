package com.alibaba_tencent.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.alibaba_tencent.pms.mapper")
@EnableDubbo
@SpringBootApplication
public class EmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallPmsApplication.class, args);
    }

}
