package com.example.world.service.Command.Control;

import com.example.world.service.Command.Command;
import lombok.Setter;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 下午4:05
 */
public class SimpleRemoteControl {

  @Setter
  private Command command;

  public SimpleRemoteControl() {

  }

  public void buttonWasPressed() {
    command.execute();
  }
}
