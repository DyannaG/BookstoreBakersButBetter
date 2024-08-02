package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.AddressRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = AddressRepository.class)
public class BookstoreBakersButBetterApplication{

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBakersButBetterApplication.class, args);
//createAddress()
	}

//	@Override
//	public void run(String... args) throws Exception {
//	}

//	void createAddress() {
//		System.out.println("Creating address");
//		addyRepo.save(new Address("444", "maple"));
//		System.out.println("complete!");

}

