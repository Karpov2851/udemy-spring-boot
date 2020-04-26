package com.boot.udemy.repository;

import com.boot.udemy.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vikas on 26-04-2020.
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Integer>{
}
