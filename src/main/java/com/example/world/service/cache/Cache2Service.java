package com.example.world.service.cache;

import com.example.world.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/12/20 下午4:37
 */
@Service
public class Cache2Service {

  @Autowired
  private CacheService cacheService;

  @Async
  public void aa() {
    User u = cacheService.get();
    try {
      Thread.sleep(5000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    String s = StaticFactory.api(u);
    System.out.println(s);
  }

  public void rm() {
    cacheService.rm();

  }
}
