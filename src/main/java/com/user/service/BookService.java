package com.user.service;

import com.user.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by faith on 8/25/16.
 */
public interface BookService {

    Book createBook (Book book);
    Book findByBookId (long id);
    List<Book> findAll();
}
