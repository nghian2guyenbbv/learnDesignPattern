package com.example.commanddesign.command.commander;

import com.example.commanddesign.command.Fan;
import com.example.commanddesign.command.ICommand;

public class TurnOffCommander implements ICommand {
  private Fan fan;

  public TurnOffCommander(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void excute() {
    fan.turnOffFan();
  }

  @Override
  public void rollback() {
    fan.turnOnFan();
  }
}
