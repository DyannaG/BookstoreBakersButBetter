package controller;

import collection.Address;
import collection.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableMongoRepositories
@Slf4j
public class UserController {
    @PostMapping("/User")
    public ResponseEntity<String> UserController(@RequestBody User user){
        log.info(user.getName());
        log.info(user.getPassword());
        log.info(user.getUsername());
        ResponseEntity<String> credentials= ResponseEntity.ok("Recieved");
        return credentials;
    }
    @GetMapping("/User/Address")
    @ResponseBody
    public ResponseEntity<Address> AddressController(){
        Address addy = new Address();

        ResponseEntity<Address> address = ResponseEntity.ok(addy);
        return ResponseEntity.ok(addy);

    }
}
