package com.hf.ciker.works;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ciker
 * @version 1.0
 * @date 2021/1/3 16:06
 */
@SpringBootApplication
@MapperScan("com.hf.ciker.works.mapper")
public class CikerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CikerApplication.class, args);
    }
}
