package com.yakovlev.springbootproject.services;


import com.yakovlev.springbootproject.entities.SystemUser;
import com.yakovlev.springbootproject.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String username);
    boolean save(SystemUser systemUser);
}
