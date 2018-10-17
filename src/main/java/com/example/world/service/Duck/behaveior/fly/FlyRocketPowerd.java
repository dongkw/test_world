package com.example.world.service.Duck.behaveior.fly;

import com.example.world.service.Duck.behaveior.FlyBehavior;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:16
 */
public class FlyRocketPowerd implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I im fly with a rocket");
  }
}
