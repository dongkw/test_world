package com.example.world.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class ClassLoadTest {

  private static ClassLoadTest test = new ClassLoadTest();

  static int x;
  static int y = 0;

  public ClassLoadTest() {
    x++;
    y++;
  }

  public static void main(String[] args) {
      ClassLoadTest test=new ClassLoadTest();
      test.add();
  }

  private final AtomicLong count = new AtomicLong(0);

  private final LongAdder adder = new LongAdder();


  private void add() {
    System.out.println(count.addAndGet(1));
    System.out.println(count);
    System.out.println(count.getAndAdd(4));
    System.out.println(count);
    adder.add(1);
    adder.add(1);
    adder.sum();
    System.out.println(adder);
  }



}


