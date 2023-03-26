package com.example.userRopository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IMUserRepository implements UserRepository {
    private List<User> users = new ArrayList<>();

    public IMUserRepository(){
        users.add(new User(1, "George", 26, "george@example.com"));
        users.add(new User(2, "Marty", 43, "marty@example.com"));
        users.add(new User(3, "Veronica", 34, "veronika@example.com"));
        users.add(new User(4, "Andy", 29, "andy@example.com"));
        users.add(new User(5, "Ema", 32, "ema@example.com"));
    }


    public List<User> findAll(){
        return users;
    }

    public User findById(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
