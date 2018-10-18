package com.example.world.config;

import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/18 下午2:09
 */
@Configuration
public class MongoConfig {
  @Value("${spring.data.mongodb.uri}")
  private String uri;

  @Bean
  public MongoDbFactory mongoDbFactory()throws UnknownHostException{
    MongoClientURI mongoClientURI=new MongoClientURI(uri);
    MongoDbFactory mongoDbFactory=new SimpleMongoDbFactory(mongoClientURI);
    return mongoDbFactory;
  }
}
