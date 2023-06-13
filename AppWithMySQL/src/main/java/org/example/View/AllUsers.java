package org.example.View;

import org.example.Model.Interfaces.ShowUsers;
import org.example.Model.User;

import java.util.List;

public class AllUsers implements ShowUsers {
    public void show(List<User> users){
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}
