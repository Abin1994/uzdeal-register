package com.itcat.uzdealregister.controller;

import com.itcat.uzdealregister.rabbitmq.MQSender;
import com.itcat.uzdealregister.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/12
 */
@RestController
public class MqController {

/*    @Autowired
    MQSender mqSender;

    public Object mq(){
        mqSender.send("hello,itcat");
        return Result.success("ok");
    }*/
}
