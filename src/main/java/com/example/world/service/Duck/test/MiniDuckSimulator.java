package com.example.world.service.Duck.test;

import com.example.world.service.Duck.Duck;
import com.example.world.service.Duck.DuckImpl.MallardDuck;
import com.example.world.service.Duck.DuckImpl.ModelDuck;
import com.example.world.service.Duck.behaveior.fly.FlyRocketPowerd;
import com.example.world.service.Duck.DuckCall;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:13
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();
    model.setFlyBehavior(new FlyRocketPowerd());
    model.performFly();

    DuckCall duckCall = new DuckCall();
    duckCall.call();
  }
}
