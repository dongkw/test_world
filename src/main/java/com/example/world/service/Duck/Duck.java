package com.example.world.service.Duck;

import com.example.world.service.Duck.behaveior.FlyBehavior;
import com.example.world.service.Duck.behaveior.QuackBehavior;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午3:52
 */
public abstract class Duck {

  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All duck float,even decoys");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
