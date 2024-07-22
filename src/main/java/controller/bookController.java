package controller;

import collection.book;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@EnableMongoRepositories
public class bookController {
    @Autowired
    private BookService bookService;

    @Override
    public String save(@RequestBody book book){
     //   return bookService.save(book).getbookId();
        //return null;
        return "";
    }

}
