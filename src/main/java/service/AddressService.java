package service;

import collection.Address;
import org.springframework.context.annotation.Bean;
import repository.AddressRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = AddressRepository.class)
@ComponentScan(basePackages = {"my_package.infrastructure.mongo"})

public interface AddressService {
    //@Bean
    public String printItemDetails(Address item);

    public void showAllAddress();

    void getAddressById(String id);

    void updateStreetName(String street, String newName);

    void deleteAddress(String id);

    void updateById(String newName, String id);
}
