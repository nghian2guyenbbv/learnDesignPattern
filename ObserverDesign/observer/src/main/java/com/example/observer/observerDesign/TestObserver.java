package com.example.observer.observerDesign;

import com.example.observer.observerDesign.Obser.EmailObserver;
import com.example.observer.observerDesign.Obser.PhoneObserver;

public class TestObserver {
  public static void main(String[] args) {

    DataVideo dataVideo = new DataVideo("firstVideo", "videoDesc", "pornHub");
    EmailObserver emailObserver = new EmailObserver(dataVideo);
    PhoneObserver phoneObserver = new PhoneObserver(dataVideo);
    System.out.println("================ Add observer");
    dataVideo.uploadVideo();
    System.out.println("=========== remove Observer");
    dataVideo.removeObserver(emailObserver);
    dataVideo.uploadVideo();
  }

}
