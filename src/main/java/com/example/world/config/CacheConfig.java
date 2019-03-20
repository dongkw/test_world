package com.example.world.config;


import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by ywb on 9/5/2017.
 */
@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport {

  @Value("${cacheExpire:600}")//10*60s
  private Integer defaultExpire;

  @Bean
  public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory connectionFactory) {
    RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(connectionFactory);
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new RedisSerializer<>() {
      private final ObjectMapper om = new ObjectMapper()
          .enableDefaultTyping(DefaultTyping.NON_FINAL, As.PROPERTY);

      @Override
      public byte[] serialize(Object t) throws SerializationException {
        try {
          return om.writeValueAsBytes(t);
        } catch (JsonProcessingException e) {
          throw new SerializationException(e.getMessage(), e);
        }
      }

      @Override
      public Object deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null) {
          return null;
        }
        try {
          return om.readValue(bytes, Object.class);
        } catch (Exception e) {
          throw new SerializationException(e.getMessage(), e);
        }
      }
    });
    return redisTemplate;
  }


  @Bean
  public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
    RedisCacheManager cacheManager = RedisCacheManager.create(connectionFactory);
    return cacheManager;
  }


  /**
   * customized keyGenerator This will generate a unique key of the class name, the method name and
   * all method parameters appended.
   */
  @Bean
  public KeyGenerator keyGenerator() {
    return (Object o, Method method, Object... objects) -> {
      StringBuilder sb = new StringBuilder();
      sb.append(o.getClass().getName()).append(".");
      sb.append(method.getName()).append("(");
      if (objects.length == 0) {
        sb.append(")");
        return sb.toString();
      }
      Stream.of(objects).filter(Objects::nonNull)
          .map(obj -> obj.getClass().getSimpleName() + ":" + obj.toString() + ",")
          .forEach(sb::append);
      sb.deleteCharAt(sb.length() - 1);
      sb.append(")");
      return sb.toString();
    };
  }


}
