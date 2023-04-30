package org.example.View;

import org.example.Model.Interfaces.ViewService;

public class NotFoundUser implements ViewService {
    @Override
    public void show() {
        System.out.println("Ошибка про вводе данных, либо пользователь не найден.");
    }
}
