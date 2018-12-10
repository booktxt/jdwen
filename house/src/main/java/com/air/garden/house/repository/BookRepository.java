package com.air.garden.house.repository;

import com.air.garden.house.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

    List<Book> findByNameLike(String name);

}
