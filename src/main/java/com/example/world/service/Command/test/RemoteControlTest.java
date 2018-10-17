package com.example.world.service.Command.test;

import com.example.world.service.Command.Command;
import com.example.world.service.Command.Control.SimpleRemoteControl;
import com.example.world.service.Command.bean.GarageDoor;
import com.example.world.service.Command.bean.Light;
import com.example.world.service.Command.impl.GarageDoorOpenCommand;
import com.example.world.service.Command.impl.LightOnCommand;
import java.util.GregorianCalendar;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 下午4:14
 */
public class RemoteControlTest {

  public static void main(String[] args) {
    SimpleRemoteControl control = new SimpleRemoteControl();
    Command lightOn = new LightOnCommand(new Light());
    control.setCommand(lightOn);
    control.buttonWasPressed();
    Command doorOpen = new GarageDoorOpenCommand(new GarageDoor());
    control.setCommand(doorOpen);
    control.buttonWasPressed();
  }
}
