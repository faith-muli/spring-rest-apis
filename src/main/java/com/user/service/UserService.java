package com.user.service;

import com.user.domain.User;

import java.util.List;

/**
 * Created by faith on 8/23/16.
 */
public interface UserService {

    User createUser (User user);

    User findUserById (long Id);

    List<User>findAll();

    User updateUser(long id, User user);

   List<User> findUserByEmail(String email);

    List<User> findUserByNameOrEmail(String search);




}
