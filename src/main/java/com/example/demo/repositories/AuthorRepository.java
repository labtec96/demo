package com.example.demo.repositories;

import com.example.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 019-09-22
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
