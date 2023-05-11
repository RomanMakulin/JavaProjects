package org.example.View.Sorting;

import org.example.Model.Interfaces.SortingView;
import org.example.Model.SalaryInfo;

public class ShowLowerSalary implements SortingView {
    @Override
    public void sorting(SalaryInfo salaryInfo){
        System.out.println("Note with the lowermost salary: \n" + salaryInfo);
    }
}
