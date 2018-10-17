package com.example.world.service.coffee.beverage.impl;

import static com.example.world.service.coffee.beverage.BeverageEnum.TALL;

import com.example.world.service.coffee.beverage.Beverage;
import com.example.world.service.coffee.beverage.BeverageEnum;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:25
 */
public class Espresso extends Beverage {

  public Espresso() {
    setDescription("Espresso");
  }

  @Override
  public double cost() {
    switch (this.getSize()) {
      case TALL:
        return 3.0;
      case GRANDE:
        return 6.0;
      case VENTI:
        return 9.0;
      default:
        return 0;
    }
  }

}
