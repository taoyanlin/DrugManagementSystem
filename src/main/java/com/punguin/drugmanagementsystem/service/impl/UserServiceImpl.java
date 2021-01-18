package com.punguin.drugmanagementsystem.service.impl;

import com.punguin.drugmanagementsystem.entity.User;
import com.punguin.drugmanagementsystem.repository.UserRepository;
import com.punguin.drugmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserName(String username) {

        if (!StringUtils.hasText(username)) {
            return new User();
        }
        List<User> userByName = userRepository.findByUsername(username);
        if (userByName.size() != 1) {
            return new User();
        }

        User user = userByName.get(0);

        /**
         * 添加登录验证
         */

        return user;
    }
}
