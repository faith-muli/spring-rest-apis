package com.user.data;

import com.user.domain.Author;
import com.user.domain.Bank;
import com.user.domain.Book;
import com.user.domain.User;
import com.user.repository.AuthorRepository;
import com.user.repository.BankRepository;
import com.user.repository.BookRepository;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by faith on 8/23/16.
 */
@Component
public class DummyData implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BankRepository bankRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;



    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("faith","wa@faith.com"));
        userRepository.save(new User("dan", "dan@gmail.com"));
        userRepository.save(new User("kevin", "kevin@gmail.com"));
        userRepository.save(new User("elphas", "elphas@gmmail.com"));
        User user=userRepository.save(new User("fasoh","faso@gmail.com"));
        //bank
        bankRepository.save(new Bank("kcb", "12", "45",user));

        //book and author
       // Book book=new Book("hello world");

       Author author=new Author("Dan");
        authorRepository.save(author);

       // book.addAuthor(author);
        bookRepository.save(new Book("hello world")).addAuthor(author);


    }
}
