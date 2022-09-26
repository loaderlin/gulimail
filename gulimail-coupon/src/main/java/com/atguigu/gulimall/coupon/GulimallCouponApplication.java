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

/**
 * Nacos Config 配置空间
 *
 * 1、命名空间：配置隔离
 *      默认：public（保留空间）；默认新增的所有配置都在public空间
 *      一、开发；测试；生产：利用命名空间来做环境隔离。
 *      注意：在bootstrap.properties；配置上，需要使用哪个命名空间下的配置
 *      spring.cloud.nacos.config.namespace=94dd6bc9-b58e-4fb5-b0e4-7a8982b265b6
 *      二、基于每一个微服务之间相互隔离配置，每个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 * 2、配置集
 *      所有的配置的集合  application.yml application.properties里面的所有内容
 * 3、配置集ID
 *      类似配置文件名 Data ID：类似文件名
 * 4、配置分组
 *      默认所有的配置集都属于：DEFAULT_GROUP
 *      dev,test,prod
 * 每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 *
 * Nacos Config 加载多个配置集
 *
 * 同时加载多个配置集
 * 1、微服务任何配置信息，任何配置文件都可以放在配置中心中
 * 2、只需要在bootstrap.properties说明加载配置中心那些配置文件即可
 * 3、@Value，@ConfigurationProperties...
 * 以前SpringBoot任何方法从配置文件中获取值，都能使用。
 * 配置中心有的优先使用配置中心中的。
 */


@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
