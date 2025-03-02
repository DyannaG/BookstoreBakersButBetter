package repository;

import collection.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends MongoRepository<Address,String> {

    @Query("{_id:'?0'}")
    Address findItemById(String id);

//    @Query("{_id:'?0'}")
//    @Update("{'$set': {'street': ?1}}")
//    Address findByIdForStreet(String id, String street);

    @Query(value="{street:'?0'}", fields="{'id' : 1, 'city' : 1, 'state' : 1, 'zip' : 1}")
    List<Address> findAll(String street);

    public long count();
}
