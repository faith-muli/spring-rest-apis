package com.user.service;

import com.user.domain.Author;

import java.util.List;

/**
 * Created by faith on 8/25/16.
 */
public interface AuthorService {
    Author createAuthor (Author author);
   Author findByAuthorId (long id);
    List<Author> findAll();
}
