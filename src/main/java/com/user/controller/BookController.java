package com.user.controller;

import com.user.domain.Book;
import com.user.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by faith on 8/25/16.
 */
@RestController
@RequestMapping(value = "book")
public class BookController  {

    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book>findAll() {
        return bookService.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

}
