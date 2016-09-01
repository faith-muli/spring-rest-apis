package com.user.service;

import com.user.domain.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by faith on 8/23/16.
 */

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAll()

    {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(long id, User user) {
        User updateUser=userRepository.findOne(id);
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        return  userRepository.save(updateUser);

    }

    @Override
    public List<User> findUserByEmail(String email) {
        return  userRepository.findByEmailIgnoreCase(email);
    }

    @Override
    public List<User> findUserByNameOrEmail(String search) {
        return userRepository.findUserByNameOrEmail(search, search);
    }


}
