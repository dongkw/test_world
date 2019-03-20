package com.example.world.service.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/19 下午2:19
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonBehavior {
  @Setter
  private Person person;

  public abstract void toDo();

  public abstract void walk();

  public abstract void battle();
}
