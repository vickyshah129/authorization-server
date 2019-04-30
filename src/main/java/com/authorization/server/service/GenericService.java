package com.authorization.server.service;

import com.authorization.server.domain.RandomCity;
import com.authorization.server.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
