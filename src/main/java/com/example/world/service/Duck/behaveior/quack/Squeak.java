package com.example.world.service.Duck.behaveior.quack;

import com.example.world.service.Duck.behaveior.QuackBehavior;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:01
 */
public class Squeak implements QuackBehavior{

  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
