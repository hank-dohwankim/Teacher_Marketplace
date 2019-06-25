package com.system.marketplace.service;

import com.system.marketplace.domain.User;
import com.system.marketplace.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class UserService {

    @Resource
    UserRepository userRepository;

    public ArrayList<User> userList() {
        return userRepository.userList();
    }

    public User findById(int id) {
        return userRepository.findById(id);
    }

    public int post(User userData) {
        return userRepository.post(userData);
    }

    public int put(User userData) {
        return userRepository.put(userData);
    }

    public int delete(int user_id) {
        return userRepository.delete(user_id);
    }
}
