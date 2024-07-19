package controller;

import collection.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    private bookService bookService;

    @Override
    public String save(@RequestBody book book){
        return bookService.save(book).getbookId();

    }

}
