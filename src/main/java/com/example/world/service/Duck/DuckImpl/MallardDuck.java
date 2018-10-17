package com.example.world.service.Duck.DuckImpl;

import com.example.world.service.Duck.Duck;
import com.example.world.service.Duck.behaveior.fly.FlyWithWings;
import com.example.world.service.Duck.behaveior.quack.Quack;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:07
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I im a MallardDuck");
  }
}
