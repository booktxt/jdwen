package com.air.garden.house.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

/**
 * @author wenjd
 * @date 2018/12/08
 */
@Configuration
public class RedisConfiguration {

    @Value("${spring.redis.state.host}")
    private String stateHost;

    @Value("${spring.redis.state.password}")
    private String statePassword;

    @Value("${spring.redis.state.database}")
    private int stateDatabase;

    @Value("${spring.redis.state.port}")
    private int statePort;

    @Value("${spring.redis.state.timeout}")
    private int stateTimeout;

    @Value("${spring.redis.state.pool.max-idle}")
    private int stateMaxIdle;

    @Value("${spring.redis.state.pool.min-idle}")
    private int stateMinIdle;


    @Bean
    public RedisConnectionFactory stateRedisConnectionFactory() {

        RedisStandaloneConfiguration standaloneConfig = new RedisStandaloneConfiguration();
        standaloneConfig.setHostName(stateHost);
        standaloneConfig.setPort(statePort);
        standaloneConfig.setPassword(RedisPassword.of(statePassword));
        standaloneConfig.setDatabase(stateDatabase);

        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(stateMaxIdle);
        poolConfig.setMinIdle(stateMinIdle);

        JedisClientConfiguration clientConfig = JedisClientConfiguration.builder()
                .connectTimeout(Duration.ofMillis(stateTimeout)).readTimeout(Duration.ofMillis(stateTimeout))
                .usePooling().poolConfig(poolConfig).build();

        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(standaloneConfig, clientConfig);

        return connectionFactory;
    }

    @Bean
    public RedisTemplate<String, Object> stateRedisTemplate() {

        GenericJackson2JsonRedisSerializer jsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(stateRedisConnectionFactory());
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setValueSerializer(jsonRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setHashValueSerializer(jsonRedisSerializer);

        return redisTemplate;
    }

    @Bean
    public RedisLockService redisLockService() {
        return new RedisLockService(stateRedisTemplate());
    }


}
