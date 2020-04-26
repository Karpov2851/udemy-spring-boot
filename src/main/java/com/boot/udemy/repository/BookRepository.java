package com.boot.udemy.repository;

import com.boot.udemy.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vikas on 26-04-2020.
 */
@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
