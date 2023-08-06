package com.example.observer.observerDesign;

import com.example.observer.observerDesign.Obser.Observer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Subject {
  public String videoName;
  public String videoDesc;
  public String videoContent;
  List<Observer> listOb = new ArrayList<Observer>();

  public void addObserver(Observer observer) {
    listOb.add(observer);
  }

  public void removeObserver(Observer observer) {
    listOb.remove(observer);

  }

  public void notifyAfterUploadVideo() {
    listOb.stream().forEach(ob -> ob.notifyOb(this, null));
  }
}
