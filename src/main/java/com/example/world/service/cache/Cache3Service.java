package com.example.world.service.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/12/20 下午5:42
 */
@Service
public class Cache3Service {

  @Autowired
  private Cache2Service cache2Service;

  public void asc() {
    for (int i = 0; i < 1000; i++) {
      cache2Service.aa();
    }
  }
}
