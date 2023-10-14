package com.bookStore.service;

import com.bookStore.dto.UserRegistrationDto;
import com.bookStore.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
