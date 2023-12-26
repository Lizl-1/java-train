package com.zghc.train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lizl
 * @Description
 * @Data 2023/12/26/0026 11:14
 * @Version 1.0.0
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
