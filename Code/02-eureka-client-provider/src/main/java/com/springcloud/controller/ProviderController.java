package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Kiera
 * @Date: 2021/5/10 15:50
 * @Description:
 */
@RestController
public class ProviderController {
    @RequestMapping("/test")
    public Object test(){
        return "服务提供者";
    }
}
