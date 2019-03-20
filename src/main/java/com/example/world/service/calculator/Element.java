package com.example.world.service.calculator;

import lombok.Getter;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/22 下午3:01
 */
public class Element {

  @Getter
  private int result = 0;

  public Element and(int i1, int i2) {
    if (i1 == 1 && i2 == 1) {
      result = 1;
    }
    return this;
  }

  public Element and(int i) {
    if (i == 1 && result == 1) {
      result = 1;
    } else {
      result = 0;
    }
    return this;
  }
  public Element and(Element e1, Element e2) {
    if (e1.getResult() == 1 && e2.getResult() == 1) {
      result = 1;
    }
    return this;
  }

  public Element or(int i1, int i2) {
    if (i1 == 1 || i2 == 1) {
      result = 1;
    }
    return this;
  }

  public Element or(Element e1, Element e2) {
    if (e1.getResult() == 1 || e2.getResult() == 1) {
      result = 1;
    }
    return this;
  }

  public Element or(int i) {
    if (i == 1 || result == 1) {
      result = 1;
    } else {
      result = 0;
    }
    return this;
  }

  public Element not(int i) {
    if (i == 0) {
      result = 1;
    } else if (i == 1) {
      result = 0;
    }
    return this;
  }

  public Element not() {
    if (result == 0) {
      result = 1;
    } else if (result == 1) {
      result = 0;
    }
    return this;
  }
}
