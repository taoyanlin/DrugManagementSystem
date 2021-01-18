package com.punguin.drugmanagementsystem.service;

import com.punguin.drugmanagementsystem.entity.User;

import java.util.List;

public interface UserService {
    User findByUserName(String username);
}
