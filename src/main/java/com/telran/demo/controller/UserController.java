package com.telran.demo.controller;


import com.telran.demo.model.entity.User;

import com.telran.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")

public class UserController {

    @Autowired
    public UserRepository userRepository;


//    public User add( @RequestBody UserRepository user){
//
//
//    }
//
//    public  User getById (@PathVariable ("Id") String id){
//
//    };
//
//    public  User deleteById (@PathVariable ("Id") String id){
//
//
//    };

}
