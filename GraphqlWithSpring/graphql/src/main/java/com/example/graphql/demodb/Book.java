package com.example.graphql.demodb;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Author author;
  private String title;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  private String name;

  public Book(){

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book( Author author, String title, String name) {
    this.author = author;
    this.title = title;
    this.name = name;
  }
}
