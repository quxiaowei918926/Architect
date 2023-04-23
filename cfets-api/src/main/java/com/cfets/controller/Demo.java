package com.cfets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:quxiaowei
 * @create:2023-04-23 10:45
 * @Description:
 */
@RestController
public class Demo {
    @GetMapping("/hello")
    public String test() {
        return "Hello";
    }
}
