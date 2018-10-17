package com.example.world.service.pizza.ingredientFactory.impl;

import com.example.world.service.pizza.ingredientFactory.PizzaIngredientFactory;
import com.example.world.service.pizza.ingredientFactory.ingredient.Cheese;
import com.example.world.service.pizza.ingredientFactory.ingredient.Dough;
import com.example.world.service.pizza.ingredientFactory.ingredient.Sauce;
import com.example.world.service.pizza.ingredientFactory.ingredient.impl.MarinaraSauce;
import com.example.world.service.pizza.ingredientFactory.ingredient.impl.NoCheese;
import com.example.world.service.pizza.ingredientFactory.ingredient.impl.ReggianoCheese;
import com.example.world.service.pizza.ingredientFactory.ingredient.impl.ThinCrustDough;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 上午11:29
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new NoCheese();
  }
}
