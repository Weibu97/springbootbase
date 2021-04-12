package com.service;

import com.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> alluser();
    User findeById(String username);
    public int adduser(User user);
}
