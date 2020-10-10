package com.example.demo;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.time.LocalDateTime;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;
	@Test
	void contextLoads() {
        ValueOperations forValue = redisTemplate.opsForValue();
//        forValue.set("key",LocalDateTime.now());
        System.out.println(forValue.get("key"));
        System.out.println(LocalDateTime.now());
    }


    @Test
    void test2() {

    }

}
