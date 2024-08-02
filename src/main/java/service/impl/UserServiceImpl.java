
package service.impl;

import collection.Address;
import collection.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.UserRepository;



import java.util.Arrays;
import java.util.List;


//@EnableMongoRepositories(basePackageClasses = UserRepository.class)
//public class UserServiceImpl implements CommandLineRunner, UserService {

////    @Override
////    public User create(User user) {
////        return null;
////    }
//
//    @Autowired
//    UserRepository userRepo;

//    @Override
//    public String printItemDetails(user item) {
//       // System.out.println("id: \n" + item.getId() + "\nuser details: \n" + item.getName() + "\n" + item.getUsername() + "\n" + item.getPassword() + "\n" + Arrays.toString(item.getAddress()));
//        return "";
//    }
//
//    @Override
//    public void showAllUser() {
//        userRepo.findAll().forEach(item -> System.out.println(printItemDetails(item)));
//    }
//
//    @Override
//    public void getUserById(Integer id) {
//        user foundUser = userRepo.findItemById(id);
//        System.out.println(printItemDetails(foundUser));
//    }
//
//    @Override
//    public void updateUsername(String username, String newName) {
//
//    }
//
//    @Override
//    public void updateName(String name, String newName) {
////        List<user> list = userRepo.findAll(name);
////
////        list.forEach(item -> {item.setName(newName);});
////
////        List<user> updated = userRepo.saveAll(list);
////
////        if(updated != null){
////            System.out.println("Successfully updated " + updated.size() + " items.");
//        }
//
//    @Override
//    public void deleteUser(Integer id) {
//        userRepo.deleteById(id);
//        System.out.println("item with id " + id + " deleted.");
   //}
