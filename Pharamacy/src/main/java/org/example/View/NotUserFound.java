package org.example.View;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Interfaces.ViewService;
import org.example.Model.Pharmacy;

public class NotUserFound implements ViewService {

    @Override
    public void show() {
        System.out.println("\nUser not found");
    }
}
