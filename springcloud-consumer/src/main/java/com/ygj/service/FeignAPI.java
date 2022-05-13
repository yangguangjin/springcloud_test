package com.ygj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.ws.rs.GET;

/**
 * @Auther: ygj
 * @Date: 2022/5/10 - 05 - 10 - 18:29
 */
@FeignClient(name = "springcloud-provider")
public interface FeignAPI {

    @GetMapping("/test1")
    String test1();


}
