package com.example.BookstoreBakersButBetter.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User create(User user);
}

