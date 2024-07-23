package com.example.BookstoreBakersButBetter.repository;

import com.example.BookstoreBakersButBetter.collection.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<user,Integer> {
}

