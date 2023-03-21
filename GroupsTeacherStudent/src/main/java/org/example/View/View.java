package org.example.View;

import java.util.List;

public class View<T> {
    public String usersView(List<T> users){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < users.size(); i++) {
            str.append(users.get(i) + "\n");
        }
        return str.toString();
    }
}
