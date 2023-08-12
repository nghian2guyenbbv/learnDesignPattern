package com.example.graphql;

import com.example.graphql.demodb.Author;
import com.example.graphql.demodb.AuthorRepository;
import com.example.graphql.demodb.Book;
import com.example.graphql.demodb.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GraphqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphqlApplication.class, args);
    /*ApplicationContext applicationContext = SpringApplication.run(GraphqlApplication.class, args);
    BookRepository bookRepository = applicationContext.getBean(BookRepository.class);
    List<Book> books = bookRepository.findAll();
    books.forEach(s->System.out.println("name: "+s.getName()+" id: "+s.getId()));*/
  }

  @Bean
  ApplicationRunner applicationRunner(AuthorRepository authorrepo, BookRepository bookrepo) {
    return args -> {
      Author nghia = authorrepo.save(new Author(1, "nghia"));
      Author ngan = authorrepo.save(new Author(2, "ngan"));
      List<Book> books = bookrepo.saveAll(
          Arrays.asList(new Book( nghia, "sach1", "sach1"), new Book( nghia, "porn", "porn")));
    };
  }

}
