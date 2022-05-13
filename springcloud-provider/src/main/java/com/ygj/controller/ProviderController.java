package com.ygj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ygj
 * @Date: 2022/5/10 - 05 - 10 - 18:24
 */
@RestController
public class ProviderController {


    @Value("${server.port}")
    private String port;
    @GetMapping("/test1")
    public String test1(){
        System.out.println("服务提供者,test01");
        return  "test1~ 端口: "+port;
    }


}
