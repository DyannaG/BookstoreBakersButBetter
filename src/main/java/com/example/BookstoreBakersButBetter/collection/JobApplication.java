package com.example.BookstoreBakersButBetter.collection;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.File;

@Data
@Builder
// ^ research these

public class JobApplication {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String applicationID;
  //

    private String username; //this is a foreign key from the user (how to implement?)

    //variables
    private String name;
    private String birthday;
    private Address[] addresses; //will contain address objects
    private String availability;
    private String experience;
    private String startDate;
    private File resume;

}
