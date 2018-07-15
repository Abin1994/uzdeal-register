package com.itcat.uzdealregister.redis;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/15
 */
public class MiaoshaUserKey extends BasePrefix{

    public MiaoshaUserKey(String prefix) {
        super(prefix);
    }

    public MiaoshaUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
