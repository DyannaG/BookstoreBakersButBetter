package service.impl;

import collection.Address;
import org.apache.catalina.User;
import collection.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.UserRepository;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@ComponentScan(basePackages = {"my_package.infrastructure.mongo"})
public class UserServiceImpl implements CommandLineRunner, UserService {
//    @Override
//    public User create(User user) {
//        return null;
//    }

    @Autowired
    UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceImpl.class, args);

    }
//    Address bobAddress = new Address("700", "mystreet", "miami", "florida", 700500);
//    String[] bobAddressIds = {bobAddress.getId()};
//    user bob = new user(660, "bob", "bob40", bobAddressIds, "bobiscool");
//    user bobDaughter = new user(669, "bobina", "bobina40", bobAddressIds, "bobinaiscooler");
    @Override
    public void run(String... args) throws Exception {
//        System.out.println("RUNNING");
//        showAllUser();
//        System.out.println("running to create bobs family");
//        userRepo.save(bob);
//        userRepo.save(bobDaughter);
//        System.out.println("created!");
//        showAllUser();
//       // updateById("cherrywood", "Cherrywood Drive", "500");
//       // showAllUser();
//        getUserById(660);
//        deleteUser(660);
//        showAllUser();
    }

    @Override
    public String printItemDetails(user item) {
       // System.out.println("id: \n" + item.getId() + "\nuser details: \n" + item.getName() + "\n" + item.getUsername() + "\n" + item.getPassword() + "\n" + Arrays.toString(item.getAddress()));
        return "";
    }

    @Override
    public void showAllUser() {
        userRepo.findAll().forEach(item -> System.out.println(printItemDetails(item)));
    }

    @Override
    public void getUserById(Integer id) {
        user foundUser = userRepo.findItemById(id);
        System.out.println(printItemDetails(foundUser));
    }

    @Override
    public void updateUsername(String username, String newName) {

    }

    @Override
    public void updateName(String name, String newName) {
//        List<user> list = userRepo.findAll(name);
//
//        list.forEach(item -> {item.setName(newName);});
//
//        List<user> updated = userRepo.saveAll(list);
//
//        if(updated != null){
//            System.out.println("Successfully updated " + updated.size() + " items.");
        }

    @Override
    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
        System.out.println("item with id " + id + " deleted.");
    }
