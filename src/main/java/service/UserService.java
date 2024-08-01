

import collection.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.UserRepository;

import java.util.List;


@EnableMongoRepositories(basePackageClasses = UserRepository.class)

public interface UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    //@Bean
    public String printItemDetails(User item);

    public void showAllUser();

    void getUserById(Integer id);

    void updateUsername(String username, String newName);



    public default List<User> findAll() {
        return repository.findAll();
    }
    public default User add(User user) {
        return repository.save(user);
    }
    public default User update(User user) {
        return repository.save(user);
    }
    public default void delete(User user) {
        repository.delete(user);
    }
}

    void updateName(String name, String newName);

    void deleteUser(Integer id);
