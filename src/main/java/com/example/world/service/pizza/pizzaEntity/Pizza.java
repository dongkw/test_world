package com.example.world.service.pizza.pizzaEntity;

import com.example.world.service.pizza.ingredientFactory.ingredient.Cheese;
import com.example.world.service.pizza.ingredientFactory.ingredient.Dough;
import com.example.world.service.pizza.ingredientFactory.ingredient.Sauce;
import java.util.ArrayList;
import lombok.Data;
import lombok.Getter;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/6 下午4:32
 */
@Data
public abstract class Pizza {

  public String name;
  private Dough dough;
  private Sauce sauce;
  private Cheese cheese;
  public ArrayList toppings = new ArrayList();

  public abstract void prepare();


  public void bake() {
    System.out.println("Bake for 25 min");
  }

  public void cut() {
    System.out.println("Cutting ...");
  }

  public void box() {
    System.out.println("to box...");
  }


}
