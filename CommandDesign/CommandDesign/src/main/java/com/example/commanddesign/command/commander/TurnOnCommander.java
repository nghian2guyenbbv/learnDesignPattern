package com.example.commanddesign.command.commander;

import com.example.commanddesign.command.Fan;
import com.example.commanddesign.command.ICommand;

public class TurnOnCommander implements ICommand {
  private Fan fan;

  public TurnOnCommander(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void excute() {
    fan.turnOnFan();
  }

  @Override
  public void rollback() {
    fan.turnOffFan();
  }
}
