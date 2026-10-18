package org.example.restclient.service;

import org.example.restclient.model.Multiuser;
import org.example.restclient.model.User;
import org.example.restclient.model.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class UserService {

    private final RestClient restClient;

    public UserService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://reqres.in/api")
                .build();
    }

    public List<UserData> getUsers() {
        List<UserData> users = restClient.get()
                .uri("/users?page=2")
                .retrieve()
                .body(Multiuser.class)
                .data();

        return users;
    }

    public UserData createUser(UserData userdata) {
        return null;
    }

}
