package com.example.graphql.demodb;

import lombok.Data;

@Data
public class BookInput {
    private String name;
    private String title;
    private Long authorId;
}
