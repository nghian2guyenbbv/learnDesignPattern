package com.example.commanddesign.command;

import com.example.commanddesign.command.commander.TurnOffCommander;
import com.example.commanddesign.command.commander.TurnOnCommander;

public class Remote {
  private TurnOnCommander turnOnCommander;
  private TurnOffCommander turnOffCommander;

  public Remote(TurnOnCommander turnOnCommander, TurnOffCommander turnOffCommander) {
    this.turnOffCommander = turnOffCommander;
    this.turnOnCommander = turnOnCommander;
  }

  public void turnOnFan() {
    turnOnCommander.excute();
  }

  public void turnOffFan() {
    turnOffCommander.excute();
  }
}
