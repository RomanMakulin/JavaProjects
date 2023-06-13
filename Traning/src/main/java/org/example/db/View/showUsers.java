package org.example.db.View;

import org.example.db.Model.User;

import java.util.List;

public class showUsers {
    public void print(List<User> users){
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}
