package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-plus
 * 导入依赖
 *         <!-- mybatis-plus -->
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *  配置
 *      1、 配置数据源
 *          导入数据库驱动
 *          在application.yml配置数据源相关信息
 *      2、 配置Mybatis-Plus
 *          使用MapperScan
 *          告诉MyBatis-Plus SQL映射文件
 *          
 *
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
