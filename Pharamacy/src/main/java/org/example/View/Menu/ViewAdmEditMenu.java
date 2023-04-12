package org.example.View.Menu;

import org.example.Model.Interfaces.ViewService;

public class ViewAdmEditMenu implements ViewService {
    @Override
    public void show(){
        System.out.println("1 - изменить цену\n2 - изменить количество\n3 - изменить название\n4 - назад");
    }
}
