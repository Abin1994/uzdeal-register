package com.itcat.uzdealregister.redis;

public interface KeyPrefix {

    public int expireSecongs();

    public String getPrefix();
}
