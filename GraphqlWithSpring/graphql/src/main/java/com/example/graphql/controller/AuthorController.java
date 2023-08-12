package com.example.graphql.controller;

import com.example.graphql.demodb.Author;
import com.example.graphql.demodb.AuthorRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
  private final AuthorRepository authorRepository;
  public AuthorController(AuthorRepository authorRepository){
    this.authorRepository = authorRepository;
  }

  @QueryMapping
  Iterable<Author> authors(){
    return authorRepository.findAll();
  }
}
