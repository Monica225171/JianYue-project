package com.soft.jianyue.api;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/*启动类*/
@MapperScan("com.soft.jianyue.api.mapper")/*在启动之前扫描Mapper*/
@EnableSwagger2Doc
public class JianyueApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(JianyueApiApplication.class, args);
    }
}