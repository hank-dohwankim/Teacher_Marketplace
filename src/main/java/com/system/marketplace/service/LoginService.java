package com.system.marketplace.service;

import com.system.marketplace.controller.LoginDto;
import com.system.marketplace.domain.User;
import com.system.marketplace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public User isUser(LoginDto loginDto) {
        return userRepository.findByUserLogin(loginDto.getUser_login());
    }

    public User isUserPassword(LoginDto loginDto) {
        return userRepository.findByUserPassword(loginDto);
    }
}
