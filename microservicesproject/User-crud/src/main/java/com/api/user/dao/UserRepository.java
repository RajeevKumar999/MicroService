package com.api.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.user.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
   public User findById(int id);
}
