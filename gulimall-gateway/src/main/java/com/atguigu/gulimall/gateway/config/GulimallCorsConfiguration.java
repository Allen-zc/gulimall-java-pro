package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 配置跨域
 */
@Configuration
public class GulimallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
        //配置跨域
        //允许哪些请求头
        corsConfiguration.addAllowedHeader("*");
        //允许哪些请求方式
        corsConfiguration.addAllowedMethod("*");
        //允许哪个请求来源
        corsConfiguration.addAllowedOrigin("*");
        //是否允许携带cookie
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",corsConfiguration);

        return new CorsWebFilter(source);
    }

}
