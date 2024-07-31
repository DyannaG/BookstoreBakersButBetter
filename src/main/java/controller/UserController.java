package controller;

import collection.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableMongoRepositories
@Slf4j
public class UserController {
    @GetMapping("/User")
    public ResponseEntity<User> UserController(){
        User user = new User();
        user.setName();
        user.setPassword("123");
        user.setUsername();
        user.setAddressID();
        return "User";
    }
}
