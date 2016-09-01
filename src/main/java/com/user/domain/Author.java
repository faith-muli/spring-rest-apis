package com.user.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by faith on 8/25/16.
 */
@Table(name = "author")
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;



    public Author( String name) {

        this.name = name;

    }



    private Author() {
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


}
