package com.example.world.service.coffee.condiment.impl;

import com.example.world.service.coffee.beverage.Beverage;
import com.example.world.service.coffee.condiment.CondimentDecorator;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:34
 */
public class Whip extends CondimentDecorator {

  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",Whip";
  }

  @Override
  public double cost() {
    return 0.3 + beverage.cost();
  }
}
