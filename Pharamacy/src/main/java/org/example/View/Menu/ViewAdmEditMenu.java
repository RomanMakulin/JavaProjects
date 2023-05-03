package org.example.View.Menu;

import org.example.Model.Interfaces.ViewService;

public class ViewAdmEditMenu implements ViewService {
    @Override
    public void show(){
        System.out.println("\n1 - edit price medicine\n2 - edit count medicine\n3 - edit name medicine\n4 - back");
    }
}
