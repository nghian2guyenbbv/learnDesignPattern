package com.example.observer.observerDesign.Obser;

import com.example.observer.observerDesign.DataVideo;
import com.example.observer.observerDesign.Subject;

public class PhoneObserver extends Observer{
  public PhoneObserver(Subject subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }

  @Override
  public void notifyOb(Subject subject, Object ob) {
    if(subject instanceof DataVideo){
      System.out.println(
          "Phone notify with detail Datavideo :" + subject.getVideoName() + " description: " + subject.getVideoDesc());
    }


  }
}
