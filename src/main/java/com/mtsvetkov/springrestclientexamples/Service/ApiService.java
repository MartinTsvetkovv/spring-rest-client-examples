package com.mtsvetkov.springrestclientexamples.Service;


import com.mtsvetkov.springrestclientexamples.domain.entities.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
