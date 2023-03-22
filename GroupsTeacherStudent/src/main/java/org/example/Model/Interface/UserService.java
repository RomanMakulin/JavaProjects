package org.example.Model.Interface;

import org.example.Model.User.User;

public class UserService implements DataServiceUser {
    @Override
    public User create(User student) {
        return student;
    }
}
