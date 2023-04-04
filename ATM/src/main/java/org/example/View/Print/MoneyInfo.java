package org.example.View.Print;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;

public class MoneyInfo implements UserService {
    @Override
    public void service(User user){
        System.out.printf("Доступные средства на счету: %d", user.getMoney());
    }
}
