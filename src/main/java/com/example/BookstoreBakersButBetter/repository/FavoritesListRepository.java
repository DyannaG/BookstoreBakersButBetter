package com.example.BookstoreBakersButBetter.repository;


import com.example.BookstoreBakersButBetter.collection.Address;
import com.example.BookstoreBakersButBetter.collection.favoritesList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FavoritesListRepository extends MongoRepository<favoritesList,String> {


}
