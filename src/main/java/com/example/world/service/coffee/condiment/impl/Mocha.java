package com.example.world.service.coffee.condiment.impl;

import com.example.world.service.coffee.beverage.Beverage;
import com.example.world.service.coffee.condiment.CondimentDecorator;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:29
 */
public class Mocha extends CondimentDecorator {

  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ",Mocha";
  }

  @Override
  public double cost() {
    switch (beverage.getSize()) {
      case TALL:
        return 0.2 + beverage.cost();
      case GRANDE:
        return 0.4 + beverage.cost();
      case VENTI:
        return 0.6 + beverage.cost();
      default:
        return 0;
    }
  }
}
