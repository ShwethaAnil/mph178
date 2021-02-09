package com.mphasis.training.service;

import java.util.Set;

import com.mphasis.training.pojos.User;

public interface UserService {
public Set<User> getAllUsers();
public String loginUser(String username,String pass);
}
