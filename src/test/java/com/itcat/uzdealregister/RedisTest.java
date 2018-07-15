package com.itcat.uzdealregister;

import com.itcat.uzdealregister.redis.MiaoshaUserKey;
import com.itcat.uzdealregister.redis.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/14
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private RedisService redisService;

    @Test
    public void test1(){
        System.err.println("...start...");
        redisService.set(new MiaoshaUserKey("q"),"test001","ddd");

        System.err.println(redisService.get(new MiaoshaUserKey("q"),"test001",String.class));
    }
}
