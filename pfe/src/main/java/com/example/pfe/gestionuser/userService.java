package com.example.pfe.gestionuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class userService{


    private final UserRepository UserRepository ;

    @Autowired
    public userService(UserRepository  UserRepository ) {
        this.UserRepository = UserRepository ;
    }


    public List<user> getUser() {
        return UserRepository .findAll();
    }

    public void addUser(user u) {

        UserRepository .save(u);
    }

    public void deleteUser(Long id) {
        UserRepository .deleteById(id);
    }
    public user getUserById(Long id) {

        return UserRepository .findById(id).orElse(null);
    }


}










