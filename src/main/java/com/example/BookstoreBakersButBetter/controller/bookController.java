package com.example.BookstoreBakersButBetter.controller;

import com.example.BookstoreBakersButBetter.collection.book;
import com.example.BookstoreBakersButBetter.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    private BookService bookService;

    @Override
    public String save(@RequestBody book book){
        return bookService.save(book).getbookId();

    }

}
