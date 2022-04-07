package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1L, "Rajeev Kumar", "8920077386"),
            new User(2L, "Shiv", "99999"),
            new User(3L, "Vedant", "8743983121")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
    
}
