package com.example.world.service.calculator;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/22 下午4:07
 */
@Data
public class FullAdder {

  @Autowired
  private Adder adder;
  private int sum;
  private int carry;

  public FullAdder(int i1, int i2, int carryIn) {
    Result result = adder.fullAdder(i1, i2, carryIn);
    sum = result.getSum();
    carry = result.getCarry();
  }

//  public FullAdder(int i1, int i2) {
////    Result result = adder.fullAdder(i1, i2, 0);
////    sum = result.getSum();
////    carry = result.getCarry();
////  }
////
////  public FullAdder(int carryIn) {
////    Result result = adder.fullAdder(sum, carryIn, carryIn);
////    sum = result.getSum();
////    carry = result.getCarry();
////  }
}
