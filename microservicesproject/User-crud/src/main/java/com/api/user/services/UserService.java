package com.api.user.services;

import java.util.List;

import com.api.user.dao.UserRepository;
import com.api.user.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    

    @Autowired
    private UserRepository userRepository;

    //get all user
    public List<User> getAllUsers()
    {
        List<User> list =(List<User>)this.userRepository.findAll();
        return list;
    }

    //get single user by id

    public User getUserById(int id)
    {       
            User user = null;
            user = this.userRepository.findById(id);
             return user;

    }

    // adding users
    public User addUser(User b)
    {
        User result = userRepository.save(b);
       return result;
    }

    //deleting users
    public void deleteUser(int bid)
    {
    	userRepository.deleteById(bid);
    }

    // updating users
    public void updateUser(User user, int Id)
    {
    	user.setId(Id);
    	user.setUsername(user.getUsername());
    	user.setEmail(user.getEmail());
    	user.setPhonenumber(user.getPhonenumber());
        userRepository.save(user);
    }
}
