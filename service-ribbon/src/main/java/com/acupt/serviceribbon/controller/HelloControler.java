package com.acupt.serviceribbon.controller;

import com.acupt.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liujie
 */
@RestController
public class HelloControler {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi() {
        return helloService.hiService();
    }
}
