package com.example.world.service.Duck.behaveior.fly;

import com.example.world.service.Duck.behaveior.FlyBehavior;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午3:56
 */
public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I im flying");
  }
}
