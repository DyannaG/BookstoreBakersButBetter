package repository;

//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.data.jpa.repository.JpaRepository;


import collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
}
