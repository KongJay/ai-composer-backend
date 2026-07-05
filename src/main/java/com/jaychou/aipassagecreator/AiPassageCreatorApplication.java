package com.jaychou.aipassagecreator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.jaychou.aipassagecreator.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class AiPassageCreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiPassageCreatorApplication.class, args);
    }

}
