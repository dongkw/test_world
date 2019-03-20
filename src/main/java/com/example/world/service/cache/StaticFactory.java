package com.example.world.service.cache;

import com.example.world.bean.User;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/12/20 下午5:11
 */
public class StaticFactory {

  public static String api(User u) {
    return u.getId() + u.getName();
  }
}
