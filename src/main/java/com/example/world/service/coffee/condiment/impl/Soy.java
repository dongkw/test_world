package com.example.world.service.coffee.condiment.impl;

import com.example.world.service.coffee.beverage.Beverage;
import com.example.world.service.coffee.condiment.CondimentDecorator;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:32
 */
public class Soy extends CondimentDecorator {

  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",Soy";
  }

  @Override
  public double cost() {
    return 0.5 + beverage.cost();
  }
}
