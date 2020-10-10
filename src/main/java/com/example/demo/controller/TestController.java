package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * @Auther: ywl
 * @Date: 2020/10/10 10:18
 * @Description:
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "test1")
    @ResponseBody
    public void test1() {
        ValueOperations value = redisTemplate.opsForValue();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        value.set("key",now);
        System.out.println("test1");
    }
}
