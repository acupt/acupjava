package com.acupt.serviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liujie
 */
@Service
public class HelloService {

    @Resource
    RestTemplate restTemplate;

    public String hiService() {
        return restTemplate.getForObject("http://SERVICE-HI/hi", String.class);
    }

}