
import collection.user;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.UserRepository;
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@ComponentScan(basePackages = {"my_package.infrastructure.mongo"})

public interface UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    //@Bean
    public String printItemDetails(user item);

    public void showAllUser();

    void getUserById(Integer id);

    void updateUsername(String username, String newName);



    public List<User> findAll() {
        return repository.findAll();
    }
    public User add(User user) {
        return repository.save(user);
    }
    public User update(User user) {
        return repository.save(user);
    }
    public void delete(User user) {
        repository.delete(user);
    }
}

    void updateName(String name, String newName);

    void deleteUser(Integer id);
}
