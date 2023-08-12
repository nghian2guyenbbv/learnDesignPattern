package com.example.graphql.demodb;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
  @Id
  @GeneratedValue
  private long id;
  private String name;

  @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
  public List<Book> books = new ArrayList<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public Author(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Author(){}

  public void setName(String name) {
    this.name = name;
  }
}
