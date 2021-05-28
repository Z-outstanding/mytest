package com.springcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.swing.*;

/**
 * @Auther: Kiera
 * @Date: 2021/5/10 14:29
 * @Description:
 * springCloud消费者,可以返回视图页面也可以显示json数据
 */
@RestController
public class ConsumerController {
    /**
     * springweb提供的一个模板工具类，可以利用这个类来访问任何基于http协议的web请求
     * 注意：
     *  springboot并没有讲这个类定义到spring上下文容器中，必须手动定义到容器中
     */
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/test")
    public Object test(){
        /**
         * 此方法是使用http协议以get方式提交请求访问远程服务，对应提供者中的getmapping，postmapping
         * 参数一为请求地址路径
         * 参数二为响应数据的封装类型
         * 返回类型为ResponseEntitu，这个对象用于封装响应式的内容包括响应头，响应体，以及响应状态码
         * 这个类型可以指定一个泛型用于封装数据，具体类型要参考参数二
         */
        String url = "http://localhost:8081/test";
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        //获取响应状态码
        System.out.println(entity.getStatusCodeValue());
        //获取响应状态码以及响应的信息
        System.out.println(entity.getStatusCode());
        //获取响应头
        System.out.println(entity.getHeaders());
        //获取响应体具体数据
        String boby = entity.getBody();
        return "第一个springcloud服务消费者 + " + boby;
    }
}
