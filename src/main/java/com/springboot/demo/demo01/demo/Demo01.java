package com.springboot.demo.demo01.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Demo01 {

    @RequestMapping("/demo")
    public String demo() {
        return "Hello";
    }
}
