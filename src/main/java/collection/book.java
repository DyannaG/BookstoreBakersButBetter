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
@Document(collection = "Books")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter


public class book {
  //  private static final java.lang.Object GenerationType = AUTO;
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String bookID;
    private String title;
    private String author;
    private String publishDate;
    private String publisher;
    private String Genre;
    private String description;
    private float price;

  public book(String id, String bookID, String title, String author, String publishDate, String publisher, String Genre, String description, float price){
    super();
    this.title = title;
    this.id = id;
    this.author = author;
    this.bookID = bookID;
    this.Genre = Genre;
    this.price = price;
    this.publishDate = publishDate;
    this.publisher = publisher;
    this.description = description;

  }
}
