package org.example.View.Print;

import org.example.Model.User;

public class MoneyInfo {
    public void print(User user){
        System.out.printf("Доступные средства на счету: %d", user.getMoney());
    }
}
