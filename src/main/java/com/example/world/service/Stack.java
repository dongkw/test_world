package com.example.world.service;

import java.sql.Connection;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2019/8/14 下午3:40
 */

public class Stack {

  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;
  ;

  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];

  }

  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return elements[--size];
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }


  public static void main(String[] args) {
    Stack stack = new Stack();
    for (int i = 0; i < 1000000000; i++) {
      stack.push(11);
      stack.pop();
    }

  }
}


