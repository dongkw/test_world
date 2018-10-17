package com.example.world.service.pizza.test;

import com.example.world.service.pizza.PizzaStore;
import com.example.world.service.pizza.pizzaEntity.Pizza;
import com.example.world.service.pizza.storeFactory.impl.ChicagoPizzaStore;
import com.example.world.service.pizza.storeFactory.impl.NYPizzaStore;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/6 下午5:04
 */
public class PizzaDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan " + pizza.getName());
    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel " + pizza.getName());
  }
}
