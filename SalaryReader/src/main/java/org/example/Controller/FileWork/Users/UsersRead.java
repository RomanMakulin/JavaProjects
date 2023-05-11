package org.example.Controller.FileWork.Users;

import org.example.Model.User;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersRead {
    public List<User> read(){
        List<User> userList = new ArrayList<>();
        try{

            FileReader reader = new FileReader("users.csv");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                userList.add(new UsersParse().parse(scanner.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }
}
