package com.example.world.service.coffee.beverage;

import lombok.Data;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:20
 */
@Data
public abstract class Beverage {

  private BeverageEnum size;
  private String description;

  public abstract double cost();
}
