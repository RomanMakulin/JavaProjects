package org.example.View;

import java.util.List;

public class View<T> {
    public void usersView(List<T> users){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < users.size(); i++) {
            str.append(users.get(i) + "\n");
        }
        System.out.println(str);
    }
}
