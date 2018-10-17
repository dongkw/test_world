package com.example.world.service.Command.impl;

import com.example.world.service.Command.Command;
import com.example.world.service.Command.bean.Light;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 下午3:56
 */
public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
