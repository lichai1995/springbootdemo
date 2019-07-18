package com.lic.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichai
 * @date 9:17 2019/7/15
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("hello")
    public String hello(){
        System.out.println("11111");
        return "Hello World2!!!";
    }
}
