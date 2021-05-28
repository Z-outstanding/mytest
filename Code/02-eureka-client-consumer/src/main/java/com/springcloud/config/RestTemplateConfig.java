package com.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Kiera
 * @Date: 2021/5/10 16:05
 * @Description:
 */
@Configuration
public class RestTemplateConfig {
    /**
     *注解用于标记当前返回的restTemplate支持Ribbon的负载均衡策略默认为轮询
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
