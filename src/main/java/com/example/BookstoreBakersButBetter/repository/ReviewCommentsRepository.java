package com.example.BookstoreBakersButBetter.repository;

import com.example.BookstoreBakersButBetter.collection.reviewComments;
import com.example.BookstoreBakersButBetter.collection.reviews;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewCommentsRepository extends MongoRepository<reviewComments,String> {
}
