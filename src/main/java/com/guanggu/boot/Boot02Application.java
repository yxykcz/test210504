package com.guanggu.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @MapperScan(value = "com.guanggu.boot.mapper")表示mapper包下所有的接口都自动生成@mapper注解
 *
 */
@MapperScan(value = "com.guanggu.boot.mapper")
@SpringBootApplication
public class Boot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot02Application.class, args);
    }

}
