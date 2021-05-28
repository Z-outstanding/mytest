package com.springcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: Kiera
 * @Date: 2021/5/10 16:03
 * @Description:
 */
@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/test")
    public Object test(){
        /**
         * 如果要通过服务名称去访问服务，需要restTemplate实现负载均衡
         */
        String url = "http://02-EUREKA-CLIENT-PROVIDER/test";
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        return "服务消费者 +" + entity.getBody();
    }
}
