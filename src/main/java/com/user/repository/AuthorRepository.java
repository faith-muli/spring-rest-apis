package com.user.repository;

import com.user.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by faith on 8/25/16.
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
