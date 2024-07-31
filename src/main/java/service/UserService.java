package service;


import collection.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

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

