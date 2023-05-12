package org.example.View.Sorting;

import org.example.Model.Interfaces.SortingAction;
import org.example.Model.SalaryInfo;
import org.example.Model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingSalary implements SortingAction {
    @Override
    public void sort(User user){
        List<SalaryInfo> tempList = new ArrayList<>();
        tempList = user.getSalaryInfoList();

        tempList.sort(Comparator.comparing(SalaryInfo::getSalary));
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println("[ID: " + i + "]\n" + tempList.get(i) + "\n");
        }
    }
}
