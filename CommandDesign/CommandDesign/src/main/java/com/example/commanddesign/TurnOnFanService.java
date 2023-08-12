package com.example.commanddesign;

import com.example.commanddesign.command.Fan;
import com.example.commanddesign.command.Remote;
import com.example.commanddesign.command.commander.TurnOffCommander;
import com.example.commanddesign.command.commander.TurnOnCommander;
import org.springframework.stereotype.Service;

@Service
public class TurnOnFanService {
  public void turnOnFan(){
    Fan fan = new Fan();
    Remote remote = new Remote(new TurnOnCommander(fan), new TurnOffCommander(fan));
    remote.turnOnFan();
    remote.turnOffFan();
  }
}
