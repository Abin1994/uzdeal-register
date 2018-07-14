package com.itcat.uzdealregister.rabbitmq;

import com.itcat.uzdealregister.config.MQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
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
public class MQReceiver {


/*
    @RabbitListener(queues = MQConfig.QUEUE)
    public void receiver(String message){
        log.info("logReceiver:"+message);
    }*/

}
