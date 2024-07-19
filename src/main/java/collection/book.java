package collection;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    private static final java.lang.Object GenerationType = AUTO ;
    @Id
    private String bookID;
    @GeneratedValue(strategy = GenerationType.AUTO)

    private string title;
    private String publisher;
    private String author;
    private String publishDate;
    private String genre;
    private float price;
}
