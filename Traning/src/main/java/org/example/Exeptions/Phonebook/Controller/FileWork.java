package org.example.Exeptions.Phonebook.Controller;



import org.example.Exeptions.Phonebook.Model.User;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWork {
    public void fileWriter(User user, String filePath){
        StringBuilder sb = new StringBuilder();

        try(java.io.FileWriter fw = new java.io.FileWriter(filePath, true);
            BufferedWriter br = new BufferedWriter(fw)) {

            String data = sb.append(user.getFio()).append(" ").append(user.getDate()).
                    append(" ").append(user.getPhone()).append(" ").append(user.getSex()).append("\n").toString();
            br.write(data);

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
