package com.example.world.service.Duck;

import com.example.world.service.Duck.behaveior.QuackBehavior;
import com.example.world.service.Duck.behaveior.quack.Quack;
import com.example.world.service.Duck.behaveior.quack.Squeak;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:26
 */
public class DuckCall {

  QuackBehavior quackBehavior = new Squeak();

  public void call() {
    quackBehavior.quack();
  }
}
