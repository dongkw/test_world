package com.example.world.service.coffee.condiment;

import com.example.world.service.coffee.beverage.Beverage;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:23
 */
public abstract class CondimentDecorator extends Beverage {

  public abstract String getDescription();
}
