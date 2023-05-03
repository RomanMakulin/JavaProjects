package org.example.View.Menu;

import org.example.Model.Interfaces.ViewService;

public class ViewAdmMainMenu implements ViewService {
    @Override
    public void show(){
        System.out.println("\nAdmin menu:\n1 - add medicine\n" +
                "2 - edit medicine info\n3 - delete medicine\n4 - Close app");
    }
}
