package com.pwl.oath;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口
@MapperScan(basePackages = {"com.pwl.oath.mapper"})
public class SpringbootOathPwlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOathPwlApplication.class, args);
    }

}
