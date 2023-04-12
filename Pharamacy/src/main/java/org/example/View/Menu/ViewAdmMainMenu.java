package org.example.View.Menu;

import org.example.Model.Interfaces.ViewService;

public class ViewAdmMainMenu implements ViewService {
    @Override
    public void show(){
        System.out.println("Меню администратирования:\n1 - добавить лекарство\n" +
                "2 - редактировать информацию о лекарстве\n3 - удалить лекарство\n4 - завершить работу");
    }
}
