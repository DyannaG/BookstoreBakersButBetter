package repository;

import collection.reviewComments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class reviewCommentsRepositoryfile extends MongoRepository<reviewComments, String> {
}
