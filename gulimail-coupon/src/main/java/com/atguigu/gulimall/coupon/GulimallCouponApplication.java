package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 *    引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2、创建一个 bootstrap.properties
 *      # 应用名 服务名
 *        spring.application.name=gulimall-coupon
 *      # nacos config 地址
 *        spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  3、 需要给配置中心默认添加一个叫 数据集（Data Id） gulimall-coupon.properties。默认规则，应用名.properties
 *  4、 给应用名.properties添加任何配置
 *  5、 动态获取配置。
 *      @RefreshScope 动态获取并刷新配置
 *      @Value("${配置项的名}") 获取到配置。
 *      如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
