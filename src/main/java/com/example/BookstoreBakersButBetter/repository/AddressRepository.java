package com.example.BookstoreBakersButBetter.repository;

import com.example.BookstoreBakersButBetter.collection.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address,String> {
}
