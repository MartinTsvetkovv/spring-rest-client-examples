package com.mtsvetkov.springrestclientexamples.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    List<User> data;

    public UserData() {
        this.data = new ArrayList<>();
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
