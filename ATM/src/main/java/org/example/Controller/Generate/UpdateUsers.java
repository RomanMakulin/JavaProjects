package org.example.Controller.Generate;

import org.example.Model.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class UpdateUsers {
    public void upd(List<User> userList) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("users.csv"));
            for (int l = 0; l < userList.size(); l++) {
                User user = userList.get(l);
                bufferedWriter.write(user.getLogin() + ";" + user.getPin() + ";" + user.getMoney() + ";" + user.getCash() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
