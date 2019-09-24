package com.example.demo.repositories;

import com.example.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 2019-09-22
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
