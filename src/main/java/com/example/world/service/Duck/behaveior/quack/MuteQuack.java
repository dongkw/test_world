package com.example.world.service.Duck.behaveior.quack;

import com.example.world.service.Duck.behaveior.QuackBehavior;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:00
 */
public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Silence");
  }
}
