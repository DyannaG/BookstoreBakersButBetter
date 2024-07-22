package collection;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@Builder
// ^ research these
public class Address {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String addressID;
    // ^ primary id
    // V variables
    private String street;
    private String city;
    private String state;
    private Integer zip;


}



