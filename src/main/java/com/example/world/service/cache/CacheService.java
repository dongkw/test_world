package com.example.world.service.cache;

import com.example.world.bean.User;
import com.example.world.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/12/20 下午4:23
 */
@Service
public class CacheService {

  @Autowired
  private UserService userService;

  @Cacheable(value = "u")
  public User get() {
    System.out.println("存入。。。");
    return userService.getById(1L);
  }

  @CacheEvict(value = "u", allEntries = true)
  public void rm() {
    User u = get();
    u.setName("bbbbb");
    u.setPwd("aaaaaaaaa");
    userService.update(u);
    System.out.println("upd。。。");
  }



}
