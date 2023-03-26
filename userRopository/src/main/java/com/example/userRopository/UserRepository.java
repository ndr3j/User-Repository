package com.example.userRopository;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    User findById(int id);
}
