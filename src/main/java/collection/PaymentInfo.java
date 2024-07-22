package collection;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@Builder
// ^ research these

public class PaymentInfo {

    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String paymentInfoId; //primary id
  //  @Id (should this be used here?)
    private String addressID; //foreign key of the address associated with the card

    //variables
    private Integer cardNumber;
    private Integer CVV;
    private String expirationDate;



}
