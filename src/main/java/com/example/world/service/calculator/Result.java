package com.example.world.service.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/22 下午4:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

  private int sum;
  private int carry;
}
