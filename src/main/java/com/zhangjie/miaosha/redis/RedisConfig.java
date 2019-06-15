package com.zhangjie.miaosha.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jason
 */
@Component
@ConfigurationProperties(prefix="redis")
@Data
public class RedisConfig {
	private String host;
	private int port;
    /**
     * 秒
     */
	private int timeout;
	private String password;
	private int poolMaxTotal;
	private int poolMaxIdle;
    /**
     * 秒
     */
	private int poolMaxWait;
}
