package com.example.world.service.person;

import com.example.world.service.env.Place;
import java.util.List;
import lombok.Data;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/19 下午2:19
 */
@Data
public abstract class Person {

  private String name;
  private int age;

  private int life;
  private int magic;

  private int power;
  private int intelligence;
  private int agile;


  private int action;

  private Place place;

  private String purpose;

  private String equipment;

  private String knapsack;

  private String skill;

  private double weight;
  private List<Object> goods;
}
