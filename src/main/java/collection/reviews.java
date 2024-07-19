package collection;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class reviews{
    private static final java.lang.Object GenerationType = AUTO ;
    @Id
    private String reviewID;
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String bookID;
    private String userID;
    private Float rating;
    private String summary;
    private String datePosted;
    private Integer likes;
    private Integer dislikes;
    private String reviewTitle;
}

