package org.example.View;

import org.example.Model.Interfaces.ViewService;

public class NotFoundId implements ViewService {
    @Override
    public void show() {
        System.out.println("Not found id");
    }
}
