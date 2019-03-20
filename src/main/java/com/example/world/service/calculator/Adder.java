package com.example.world.service.calculator;

import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/22 下午3:45
 */
@Component
public class Adder {


  public Result halfAdder(int i1, int i2) {
    int sum = sum(i1, i2);
    int carry = carry(i1, i2);
    return new Result(sum, carry);
  }

  public Result fullAdder(int i1, int i2, int carry) {
    int f1 = sum(i1, i2);
    int sum = sum(f1, carry);
    int f2 = carry(f1, carry);
    int f3 = carry(i1, i2);
    int carryFull = new Element().or(f2, f3).getResult();
    return new Result(sum, carryFull);
  }


  public int sum(int i1, int i2) {
    Element element = new Element().not(i1).and(i2);
    Element element1 = new Element().not(i2).and(i1);
    Element element2 = new Element().or(element, element1);
    return element2.getResult();
  }

  public int carry(int i1, int i2) {
    return new Element().and(i1, i2).getResult();
  }

  public static void main(String[] args) {
    System.out.println(new Adder().fullAdder(1, 1, 0));
  }

}
