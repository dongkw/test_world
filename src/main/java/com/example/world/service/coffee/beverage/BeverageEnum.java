package com.example.world.service.coffee.beverage;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:50
 */
@Getter
@AllArgsConstructor
public enum BeverageEnum {
  TALL(0, "小"),
  GRANDE(1, "中"),
  VENTI(2, "大");
  private int Code;
  private String description;

}
