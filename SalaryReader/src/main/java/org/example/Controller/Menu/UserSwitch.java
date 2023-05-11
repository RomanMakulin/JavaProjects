package org.example.Controller.Menu;

import org.example.Controller.Actions.Sorting.HigherSalary;
import org.example.Controller.Actions.Sorting.LowerSalary;
import org.example.Controller.FileWork.Notes.SaveFile;
import org.example.Model.SalaryInfo;
import org.example.Model.User;
import org.example.View.*;
import org.example.View.Error;
import org.example.View.Sorting.SortingSalary;

public class UserSwitch {
    public void menu(User user) {

        while (true) {

            switch (new UserMenu().print()) {
                case "1":
                    new ShowNotes().print(user);
                    break;
                case "2":
                    user.getSalaryInfoList().add(new SalaryInfo());
                    break;

                case "3":
                    user.getSalaryInfoList().remove(new InputID().print());
                    break;

                case "4":
                    new HigherSalary().sort(user);
                    break;

                case "5":
                    new LowerSalary().sort(user);
                    break;

                case "6":
                    new SortingSalary().sort(user);
                    break;

                case "7":
                    System.exit(1);

                default:
                    new Error().service();
                    break;

            }
            new SaveFile().save(user.getSalaryInfoList(), user.getName());
        }
    }
}
