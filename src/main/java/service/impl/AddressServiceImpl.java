package service.impl;

import org.springframework.boot.CommandLineRunner;
import collection.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.AddressRepository;
import service.AddressService;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = AddressRepository.class)
@ComponentScan(basePackages = {"my_package.infrastructure.mongo"})
public class AddressServiceImpl implements CommandLineRunner, AddressService {

    @Autowired
    AddressRepository addressRepo;

    public static void main(String[] args) {
        SpringApplication.run(AddressServiceImpl.class, args);

    }

//    Address addy = new Address("500", "cherrywood", "Dallas", "TX", 75081);
//    Address addy2 = new Address("444", "cherrywood", "Dallas", "TX", 75081);

    @Override
    public void run(String... args) throws Exception {
//        showAllAddress();
//        System.out.println("running to create cherrywood");
//        addressRepo.save(addy);
//        addressRepo.save(addy2);
//        System.out.println("created!");
//        showAllAddress();
//        updateStreetName("cherrywood", "Cherrywood Drive");
//        showAllAddress();
//        getAddressById("444");
//        deleteAddress("444");
//        showAllAddress();
    }

    @Override
    public void showAllAddress() {
        addressRepo.findAll().forEach(item -> System.out.println(printItemDetails(item)));
    }


    @Override
    public void getAddressById(String id) {
        Address addy = addressRepo.findItemById(id);
        System.out.println(printItemDetails(addy));
    }

    public String printItemDetails(Address item) {
        System.out.println("id: " + item.getId() + "address: " + item.getStreet() + item.getCity() + item.getState() + item.getZip());
        return "";
    }

    @Override
    public void updateStreetName(String street, String newName) {
        List<Address> list = addressRepo.findAll(street);

        list.forEach(item -> {item.setStreet(newName);});

        List<Address> updated = addressRepo.saveAll(list);

        if(updated != null){
            System.out.println("Successfully updated " + updated.size() + " items.");
        }


    }

    @Override
    public void deleteAddress(String id){
        addressRepo.deleteById(id);
        System.out.println("item with id " + id + " deleted.");
    }
}
