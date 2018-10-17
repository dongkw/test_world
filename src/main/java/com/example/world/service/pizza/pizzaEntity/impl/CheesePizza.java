package com.example.world.service.pizza.pizzaEntity.impl;

import com.example.world.service.pizza.ingredientFactory.PizzaIngredientFactory;
import com.example.world.service.pizza.pizzaEntity.Pizza;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/6 下午4:54
 */
public class CheesePizza extends Pizza {

  PizzaIngredientFactory factory;

  public CheesePizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  @Override
  public void prepare() {
    setName(" cheese Pizza");
    setDough(factory.createDough());
    setSauce(factory.createSauce());
    setCheese(factory.createCheese());
  }
}
