package com.example.graphql.controller;

import com.example.graphql.demodb.*;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public AuthorController(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    Iterable<Author> authors() {
        return authorRepository.findAll();
    }

    @QueryMapping
    Author authorById(@Argument long id) {
        return authorRepository.findById(id).get();
    }

    @MutationMapping
    Book addBook(@Argument BookInput bookInput) {
        Author author = authorRepository.getById(bookInput.getAuthorId());
        Book book = bookRepository.save(new Book(author, bookInput.getTitle(), bookInput.getName()));
        return book;
    }


}
