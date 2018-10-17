package com.example.world.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/17 下午4:54
 */
@Configuration
@Getter
@Component
public class ApplicationConfig {

  @Value("${spring.datasource.mysql.url}")
  private String url;
  @Value("${spring.datasource.mysql.username}")
  private String username;
  @Value("${spring.datasource.mysql.password}")
  private String password;
}
