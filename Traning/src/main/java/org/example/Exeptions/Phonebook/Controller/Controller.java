package org.example.Exeptions.Phonebook.Controller;

import org.example.Exeptions.Phonebook.Model.User;

public class Controller {
        public void button(){
            User user = new User();
            String filePath = user.getLastName() + ".txt";
            new FileWork().fileWriter(user, filePath);

        }
}
