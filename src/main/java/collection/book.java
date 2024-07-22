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
//import java.util.List;

@Data
@Builder
@Document(collection = "book")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter


public class book {
  //  private static final java.lang.Object GenerationType = AUTO;
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String bookID;


    private String title;
    private String publisher;
    private String author;
    private String publishDate;
    private String genre;
    private float price;
}
