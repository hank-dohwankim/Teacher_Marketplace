package com.system.marketplace.repository;

import com.system.marketplace.controller.LoginDto;
import com.system.marketplace.domain.User;

import java.util.ArrayList;

public interface UserRepository {
    ArrayList<User> userList();

    User findById(int id);

    int post(User userData);

    int put(User userData);

    int delete(int user_id);


    //------ 로그인 아이디로 조회
    User findByUserLogin(String user_login);


    //------ 로그인 패스워드 조회
    User findByUserPassword(LoginDto loginDto);
}
