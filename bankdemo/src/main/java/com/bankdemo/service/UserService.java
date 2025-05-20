package com.bankdemo.service;

import com.bankdemo.model.User;

public interface UserService {
    User register(User user);

    User getUserById(Long id) throws Exception;
}
