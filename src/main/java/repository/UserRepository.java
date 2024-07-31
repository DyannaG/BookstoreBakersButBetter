package repository;


import collection.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<user,Integer> {

    user findItemById(Integer id);
    //findall with username
    @Query(value="{username:'?0'}", fields="{'id' : 1, 'name' : 1, 'addressArr' : 1, 'password' : 1}")
    List<user> findAllUsername(String username);

    //findall with name
    @Query(value="{name:'?0'}", fields="{'id' : 1, 'username' : 1, 'addressArr' : 1, 'password' : 1}")
    List<user> findAllName(String name);

}