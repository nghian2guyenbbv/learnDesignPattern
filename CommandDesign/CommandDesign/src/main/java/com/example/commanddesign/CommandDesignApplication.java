package com.example.commanddesign;

import com.example.commanddesign.command.Remote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CommandDesignApplication {
  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(CommandDesignApplication.class, args);
    TurnOnFanService turnOnFanService = context.getBean(TurnOnFanService.class);
    turnOnFanService.turnOnFan();
  }

}
