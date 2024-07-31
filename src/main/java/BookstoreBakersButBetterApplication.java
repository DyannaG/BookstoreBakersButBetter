import collection.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.AddressRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = AddressRepository.class)
@ComponentScan(basePackages = {"my_package.infrastructure.mongo"})
public class BookstoreBakersButBetterApplication implements CommandLineRunner {
	@Autowired
	AddressRepository addyRepo;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBakersButBetterApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		createAddress();
	}

	void createAddress() {
//		System.out.println("Creating address");
//		addyRepo.save(new Address("444", "maple"));
//		System.out.println("complete!");
	}
}
