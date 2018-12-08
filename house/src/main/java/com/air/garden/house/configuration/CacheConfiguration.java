package com.air.garden.house.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * @author wenjd
 * @date 2018/12/07
 */
@Configuration
public class CacheConfiguration {








    //#########################################springboot 1.10##################################################














    //##########################################################################################################









    //#########################################springboot 2.0##################################################

    /*private Duration timeToLive = Duration.ZERO;

    public void setTimeToLive(Duration timeToLive) {
        this.timeToLive = timeToLive;
    }

    @Bean
    public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {

        RedisSerializer<String> redisSerializer = new StringRedisSerializer();
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

        //解决查询缓存转换异常的问题
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);

        // 配置序列化（解决乱码的问题）
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(timeToLive)
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(redisSerializer))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jackson2JsonRedisSerializer))
                .disableCachingNullValues();

        RedisCacheManager cacheManager = RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(config)
                .build();

        return cacheManager;

    }*/

    //##########################################################################################################

}
