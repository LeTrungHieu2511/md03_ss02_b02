package com.example.session02.repository;

import com.example.session02.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "nguyenvana", "vana@example.com", "admin"));
        users.add(new User(2L, "tranthib", "thib@example.com", "member"));
        users.add(new User(3L, "levanc", "vanc@example.com", "member"));
    }

    public List<User> findAll() {
        return users;
    }
}
