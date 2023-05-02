package org.example.Controller.SimpleUser;

import org.example.Controller.FileWork.UpdateFiles.SaveUser;
import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.Model.SimpleUser;
import org.example.View.Input.InputLogin;
import org.example.View.Input.InputPassword;
import java.util.List;

public class Registration implements UserService {
    @Override
    public void service(Pharmacy pharmacy) {

        String name = new InputLogin().input();
        int password = new InputPassword().input();

        pharmacy.getUserList().add(new SimpleUser(name, password));

        String path = pharmacy.getName() + "/users.csv";
        new SaveUser().save(name, password, path);

    }
}
