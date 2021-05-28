package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Kiera
 * @Date: 2021/5/10 14:18
 * @Description:
 */
/**
 * 由于是springCloud的服务提供者，因此控制器中的所有控制器方法必须全部返回json
 * 因此建议使用@restcontroller
 */
@RestController
public class ProviderController {
    @RequestMapping("/test")
    public Object test(){
        return "第一个springCloud的服务提供者";
    }
}
