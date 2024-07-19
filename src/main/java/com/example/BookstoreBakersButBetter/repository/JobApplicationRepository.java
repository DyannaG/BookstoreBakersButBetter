package com.example.BookstoreBakersButBetter.repository;

import com.example.BookstoreBakersButBetter.collection.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends MongoRepository<JobApplication, String> {
}
