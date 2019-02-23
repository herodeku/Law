package com.graduate.law.service.impl;

import com.graduate.law.bean.CustomUserDetails;
import com.graduate.law.bean.User;
import com.graduate.law.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User();
        user.setUsername("law");
        user.setPassword("law");
        return new CustomUserDetails(user);
    }
}
