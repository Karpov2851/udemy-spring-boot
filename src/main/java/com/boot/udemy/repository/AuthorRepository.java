package com.boot.udemy.repository;

import com.boot.udemy.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vikas on 26-04-2020.
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer>{
}
