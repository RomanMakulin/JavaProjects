package org.example.Controller.FileWork.Users;

import org.example.Model.User;

import java.io.FileWriter;
import java.util.List;

public class SaveUser {
    public void save (List<User> userList){
        try{
            FileWriter writer = new FileWriter("users.csv");
            for (int i = 0; i < userList.size(); i++) {
                User user = userList.get(i);
                writer.write(user.getName() + ";" + user.getPassword() + "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
