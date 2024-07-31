package repository;

import collection.book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<book,String> {

    book findItemById(String id);

    @Query(value="{author:'?0'}", fields="{'id' : 1}")
    List<book> findAll(String author);

}
