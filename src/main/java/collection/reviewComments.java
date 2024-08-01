package collection;

import com.fasterxml.jackson.annotation.JsonInclude;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Builder
@Document(collection = "book")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class reviewComments{
 //   private static final java.lang.Object GenerationType = AUTO ;
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String commentID;


    private String bookID;
    private String userID;
    private String addComments;
    private String datePosted;
    private Integer commentLikes;
    private Integer commentDislikes;
}
// hi