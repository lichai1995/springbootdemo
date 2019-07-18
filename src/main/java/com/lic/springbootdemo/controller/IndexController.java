package com.lic.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author lichai
 * @date 9:17 2019/7/15
 */
@RestController
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);


//    @RequestMapping("/index")
//    public String index(){
//        return "Hello World!";
//    }
//
//    @RequestMapping("hello")
//    public String hello(){
//        return "Hello World2!!!";
//    }
    @RequestMapping("/")
    public String index(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        logger.info("负载均衡,服务器的sessionId" + httpSession.getId());
        System.out.println("负载均衡,服务器的sessionId" + httpSession.getId());
        return httpSession.getId();
    }
}
