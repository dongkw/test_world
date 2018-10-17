package com.example.world.service.pizza;

import com.example.world.service.pizza.pizzaEntity.Pizza;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/6 下午3:38
 */
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.bake();
    return pizza;

  }

  public abstract Pizza createPizza(String type);

}
