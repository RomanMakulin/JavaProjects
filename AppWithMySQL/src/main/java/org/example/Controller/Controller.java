package org.example.Controller;

import org.example.Controller.DB.Tasks.Delete;
import org.example.Controller.DB.Tasks.ReadAll;
import org.example.Controller.DB.Tasks.SignUp;
import org.example.Controller.DB.Tasks.Update;
import org.example.Model.User;
import org.example.View.InputUsersInfo.InputIdGroup;
import org.example.View.InputUsersInfo.InputID;
import org.example.View.Menu;
import org.example.View.UsersWithDate;
import org.example.View.AllUsers;
import java.util.List;

public class Controller {
    public void startButton() {

        boolean finish = false;
        while (finish == false) {

            List<User> userList = new ReadAll().readUsers();

            switch (new Menu().show()) {

                case "1":
                    User user = new User();
                    new SignUp().signUpUser(user);
                    break;
                case "2":
                    new AllUsers().show(userList);
                    break;
                case "3":
                    new Update().updateUser(new InputID().input(), new InputIdGroup().input());
                    break;
                case "4":
                    new UsersWithDate().show(userList);
                    break;
                case "5":
                    new Delete().deleteUser(new InputID().input());
                    break;
                case "6":
                    finish = true;
                    break;

            }
        }

    }
}
