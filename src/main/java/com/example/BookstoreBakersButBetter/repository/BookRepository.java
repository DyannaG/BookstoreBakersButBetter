package com.example.BookstoreBakersButBetter.repository;

import com.example.BookstoreBakersButBetter.collection.book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<book,String> {
}
