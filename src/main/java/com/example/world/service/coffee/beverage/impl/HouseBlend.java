package com.example.world.service.coffee.beverage.impl;

import com.example.world.service.coffee.beverage.Beverage;
import com.example.world.service.coffee.beverage.BeverageEnum;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:28
 */
public class HouseBlend extends Beverage {

  public HouseBlend() {
    setDescription("House Blend");
  }

  @Override
  public double cost() {
    switch (getSize()) {
      case TALL:
        return 5.0;
      case GRANDE:
        return 8.0;
      case VENTI:
        return 9.0;
      default:
        return 0;
    }
  }
}
