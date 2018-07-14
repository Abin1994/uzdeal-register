package com.itcat.uzdealregister.rabbitmq;

import com.alibaba.fastjson.JSON;
import com.itcat.uzdealregister.config.MQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/12
 */
//@Service
@Slf4j
public class MQSender {

/*    @Autowired
    AmqpTemplate amqpTemplate ;

    public void send(Object message){
        String msg = JSON.toJSONString(message);
        log.info("logSender:"+msg);
        amqpTemplate.convertAndSend(MQConfig.QUEUE,msg);
    }*/
}
