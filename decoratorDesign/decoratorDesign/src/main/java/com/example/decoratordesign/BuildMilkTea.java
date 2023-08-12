package com.example.decoratordesign;

import com.example.decoratordesign.milktea.IMilkTea;
import com.example.decoratordesign.milktea.MilkTea;
import com.example.decoratordesign.milktea.component.Bubble;
import com.example.decoratordesign.milktea.component.Fruit;
import com.example.decoratordesign.milktea.component.Pudding;
import org.springframework.stereotype.Service;

import javax.swing.plaf.ButtonUI;

@Service
public class BuildMilkTea {
  public long buildFruitBubblePuddingMilktea(){
    IMilkTea bublbeFruitPuddingMilktea = new Bubble(new Fruit(new Pudding(new MilkTea())));
    return bublbeFruitPuddingMilktea.getCost();
  }
}
