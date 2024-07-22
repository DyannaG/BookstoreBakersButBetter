package repository;

import collection.reviews;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository  extends MongoRepository<reviews,String> {
}
