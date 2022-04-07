package com.api.user.controllers;

import java.util.List;

import com.api.user.entities.User;
import com.api.user.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

        @Autowired
        private UserService userService;

        //get all users handler
        @GetMapping("/users")
        public List<User> getUsers()
        {
            return this.userService.getAllUsers();
        }


       // get single user handler
        @GetMapping("/users/{id}")
        public User getUser(@PathVariable("id") int id)
        {
            return userService.getUserById(id);
        }

        //create new user handler
        @PostMapping("/users")
        public User addUser(@RequestBody User user)
        {
            return this.userService.addUser(user);
        }

        // delete user handler
        @DeleteMapping("/users/{hello}")
        public void deleteUser(@PathVariable("hello") int Id)
        {
            this.userService.deleteUser(Id);
            System.out.println("data deleted");
        }

        // update user handler
        @PutMapping("/users/{Id}")
        public User updateUser(@RequestBody User user, @PathVariable("Id") int Id)
        {
            this.userService.updateUser(user, Id);
            return user;
        }

}
