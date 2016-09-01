package com.user.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by faith on 8/25/16.
 */
@Table(name = "book")
@Entity
public class Book implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;

    @ManyToMany
            @JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))
    List<Author> authors=new ArrayList<>();

    public Book(String name) {
        this.name = name;

    }

    private Book() {
    }

    public long getId() {
        return id;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author)
    {
       authors.add(author);
    }

   }
