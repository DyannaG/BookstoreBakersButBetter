package repository;


import collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

     import java.util.List;
import collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {

    User findItemById(Integer id);
    //findall with username
    @Query(value="{username:'?0'}", fields="{'id' : 1, 'name' : 1, 'addressArr' : 1, 'password' : 1}")
    List<User> findAllUsername(String username);

    //findall with name
    @Query(value="{name:'?0'}", fields="{'id' : 1, 'username' : 1, 'addressArr' : 1, 'password' : 1}")
    List<User> findAllName(String name);

}