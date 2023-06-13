package org.example.View;

import org.example.Model.Interfaces.ShowUsers;
import org.example.Model.User;

import java.util.List;

public class UsersWithDate implements ShowUsers {
    public void show(List<User> userList){
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getDate() != null)
                System.out.println(userList.get(i));
        }
    }
}
