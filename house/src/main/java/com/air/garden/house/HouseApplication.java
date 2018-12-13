package com.air.garden.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.air.garden.house.mapper")
@EnableCaching
public class HouseApplication {

    public static void main(String[] args) {

//        System.setProperty("es.set.netty.runtime.available.processors", "false");

        SpringApplication.run(HouseApplication.class, args);
    }


}
