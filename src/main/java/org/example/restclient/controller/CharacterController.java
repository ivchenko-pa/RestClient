package org.example.restclient.controller;


import lombok.AllArgsConstructor;
import org.example.restclient.model.UserData;
import org.example.restclient.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserData> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public UserData createUser(@RequestBody UserData userData){
        return userService.createUser(userData);
    }

}
