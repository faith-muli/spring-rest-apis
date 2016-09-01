package com.user.controller;

import com.user.domain.Author;
import com.user.service.AuthorService;
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
@RequestMapping(value = "author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }
}
