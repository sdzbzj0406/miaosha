package com.zhangjie.miaosha.service;

import com.zhangjie.miaosha.redis.KeyPrefix;

/**
 * @author jason
 */
public interface RedisService {

    /**
     * 获取当个对象
     * */
    <T> T get(KeyPrefix prefix, String key, Class<T> clazz);

    /**
     * 设置对象
     * */
    <T> boolean set(KeyPrefix prefix, String key,  T value);

    /**
     * 判断key是否存在
     * */
    <T> boolean exists(KeyPrefix prefix, String key);

    /**
     * 增加值
     * */
    <T> Long incr(KeyPrefix prefix, String key);

    /**
     * 减少值
     * */
    <T> Long decr(KeyPrefix prefix, String key);

}
