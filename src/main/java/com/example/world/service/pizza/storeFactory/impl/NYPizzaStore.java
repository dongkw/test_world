package com.example.world.service.pizza.storeFactory.impl;

import com.example.world.service.pizza.PizzaStore;
import com.example.world.service.pizza.ingredientFactory.PizzaIngredientFactory;
import com.example.world.service.pizza.ingredientFactory.impl.NYPizzaIngredientFactory;
import com.example.world.service.pizza.pizzaEntity.Pizza;
import com.example.world.service.pizza.pizzaEntity.impl.CheesePizza;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/6 下午4:32
 */
public class NYPizzaStore extends PizzaStore {

  PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

  @Override
  public Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new CheesePizza(factory);
      default:
        return null;
    }

  }
}
