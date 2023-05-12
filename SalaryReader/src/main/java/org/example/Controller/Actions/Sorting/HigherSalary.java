package org.example.Controller.Actions.Sorting;

import org.example.Model.Interfaces.SortingAction;
import org.example.Model.User;
import org.example.View.Sorting.ShowHigherSalary;

public class HigherSalary implements SortingAction {
    @Override
    public void sort(User user) {
        long max = user.getSalaryInfoList().get(0).getSalary();
        int needId = 0;

        for (int i = 0; i < user.getSalaryInfoList().size(); i++) {
            if (user.getSalaryInfoList().get(i).getSalary() > max) {
                max = user.getSalaryInfoList().get(i).getSalary();
                needId = i;
            }
        }
        new ShowHigherSalary().sorting(user.getSalaryInfoList().get(needId));
    }
}
