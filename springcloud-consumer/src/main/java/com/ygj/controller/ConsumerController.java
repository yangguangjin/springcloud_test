package com.ygj.controller;

import com.ygj.service.FeignAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ygj
 * @Date: 2022/5/10 - 05 - 10 - 18:27
 */
@RestController
public class ConsumerController {

    @Autowired
    private FeignAPI feignAPI;

    @Value("${server.port}")
    private String port;

    @GetMapping("/test1")
    public String test1(){
        System.out.println("服务调用者");
        return "consumer"+port+"======"+feignAPI.test1();
    }



}
