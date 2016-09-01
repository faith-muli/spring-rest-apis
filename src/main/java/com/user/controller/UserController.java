package com.user.controller;

import com.user.domain.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by faith on 8/23/16.
 */
@RequestMapping(value = "user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {

        return userService.findAll();
    }

    @RequestMapping(value = "{id}")
    public User findUserById(@PathVariable long id) {
        return userService.findUserById(id);

    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @RequestMapping(value = "findUserByEmail/{email}", method = RequestMethod.GET)
    public List<User> findUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);

    }

    @RequestMapping(value = "find/{search}", method = RequestMethod.GET)
    public List<User> findUserByNameOrEmail(@PathVariable String search) {
        return userService.findUserByNameOrEmail(search);
    }

}
