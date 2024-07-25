package collection;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


//@Entity
@Getter
@Setter
public class user {

    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String name;

    private String password;

    private PaymentInfo paymentInfo;

    private Address[] address;

    private String username;

}
