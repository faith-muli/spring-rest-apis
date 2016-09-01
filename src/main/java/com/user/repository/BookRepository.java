package com.user.repository;

import com.user.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by faith on 8/25/16.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
