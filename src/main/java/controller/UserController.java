package controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableMongoRepositories
@Slf4j
@RequestMapping("/User")
public class UserController {
    @GetMapping
    public String Userpage(){
        return "User";
    }
}
