package com.mtsvetkov.springrestclientexamples.Service;

import com.mtsvetkov.springrestclientexamples.domain.entities.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApeServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void getUsersTest(){
        List<User> users = this.apiService.getUsers(3);

        assertEquals(3, users);
    }
}