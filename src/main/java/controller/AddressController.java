package controller;

import collection.Address;
import collection.User;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.AddressRepository;
import service.impl.AddressServiceImpl;
//@CrossOrigin
//@SpringBootApplication
//@Slf4j
//@EnableMongoRepositories(basePackageClasses = AddressRepository.class)
@RestController
@RequestMapping("/AddressController")
public class AddressController {


    @Autowired
    AddressRepository addressRepo;

    @PostMapping("/createAddress")
    public ResponseEntity<Address> createAddress(@RequestBody Address newAddress){
        addressRepo.save(newAddress);
        ResponseEntity<Address> created = ResponseEntity.ok(newAddress);
        return created;
    }

//    @GetMapping("/User")
//    public ResponseEntity<User> UserController(){
//        User user = new User();
//        user.setName();
//        user.setPassword("123");
//        user.setUsername();
//        user.setAddressID();
//        return "User";
//    }
}
