package collection;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document("address")
// ^ research these
//@Getter
//@Setter
public class Address {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    // ^ primary id
    // V variables
 //   @Indexed(unique = true) -- to index a variable and make it unique
    private String street;
    private String city;
    private String state;
    private Integer zip;

    public Address(String id, String street, String city, String state, Integer zip){
        super();
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}



