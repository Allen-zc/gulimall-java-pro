package com.atguigu.gulimall.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 引入sleuth链路追踪
 *  1 依赖 spring-cloud-starter-sleuth （common）
 *  2 yml logging:level:org.springframework.cloud.openfeign: debug;
 *     （这两个每个服务都应该有） org.springframework.cloud.sleuth: debug
 *
 *  整合Zipkin链路追踪可视化展示 （包含sleuth）
 *  1 依赖 spring-cloud-starter-zipkin（common）
 */

/*开启nacos服务的注册发现功能*/
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallGatewayApplication.class, args);
    }

}
