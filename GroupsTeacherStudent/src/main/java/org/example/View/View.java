package org.example.View;

import org.example.Model.User;

import java.util.List;

public class View {
    public String studentView(List<User> users){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < users.size(); i++) {
            str.append(users.get(i) + "\n");
        }
        return str.toString();
    }
}
