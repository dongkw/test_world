package com.example.world.service.Command.impl;

import com.example.world.service.Command.Command;
import com.example.world.service.Command.bean.GarageDoor;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 下午4:22
 */
public class GarageDoorOpenCommand implements Command {

  private GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.lightOn();
    garageDoor.up();
  }
}
