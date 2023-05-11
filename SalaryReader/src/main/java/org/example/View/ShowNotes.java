package org.example.View;

import org.example.Model.User;

public class ShowNotes {
    public void print(User user){
        for (int j = 0; j < user.getSalaryInfoList().size(); j++) {
            System.out.println("[ID: " + j + "]\n" + user.getSalaryInfoList().get(j));
            System.out.println();
        }
        System.out.println();
    }
}
