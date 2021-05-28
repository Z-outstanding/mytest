package com.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Kiera
 * @Date: 2021/5/10 14:36
 * @Description:
 */
@Configuration
public class RestTemplateConfig {
    /**
     * 定义RestTemlate到spring容器中
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
