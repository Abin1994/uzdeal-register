package com.itcat.uzdealregister.redis;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/15
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * set
     */
    public <T> boolean set(KeyPrefix prefix,String key,T value){
        String str = beanToString(value);
        if(str == null || str.length() <= 0){
            return false;
        }
        //生成真正的key
        String realKey = prefix.getPrefix()+key;
        int seconds = prefix.expireSecongs();
        if(seconds <= 0){
            redisTemplate.opsForValue().set(realKey,str);
        }else{
            redisTemplate.opsForValue().set(realKey,str,seconds,TimeUnit.SECONDS);
        }
        return true;

    }

    public <T> T get(KeyPrefix prefix,String key,Class<T> clazz){
        String realKey = prefix.getPrefix() + key;
        String str = (String)redisTemplate.opsForValue().get(realKey);
        T t = StringToBean(str,clazz);
        return t;
    }

    private <T> T StringToBean(String str, Class<T> clazz) {
        if(str == null || str.length()<=0 || clazz == null){
            return null;
        }
        if(clazz == int.class || clazz == Integer.class){
            return (T)Integer.valueOf(str);
        }else if(clazz == long.class || clazz == Long.class){
            return (T)Long.valueOf(str);
        }else if(clazz == String.class){
            return (T) str;
        }else {
            return JSON.toJavaObject(JSON.parseObject(str),clazz);
        }
    }


    private <T> String beanToString(T value) {
        if(value == null){
            return null;
        }
        Class<?> clazz = value.getClass();
        if(clazz == int.class || clazz == Integer.class){
            return ""+value;
        }else if(clazz == String.class){
            return (String)value;
        }else if(clazz == long.class || clazz == Long.class){
            return ""+value;
        }else{
            return JSON.toJSONString(value);
        }
    }
}
