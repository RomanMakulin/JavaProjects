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
    public void service(List<Pharmacy> pharmacyList, int i) {

        String name = new InputLogin().input();
        int password = new InputPassword().input();

        pharmacyList.get(i).getUserList().add(new SimpleUser(name, password));

        String path = pharmacyList.get(i).getName() + "/users.csv";
        new SaveUser().save(name, password, path);

    }
}
