package com.itcat.uzdealregister.utils;

import java.util.UUID;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/16
 */
public class UUIDUtil {

    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
