package com.lhy.service;

import com.lhy.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
