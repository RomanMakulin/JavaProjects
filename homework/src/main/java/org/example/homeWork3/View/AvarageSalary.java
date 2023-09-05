package org.example.homeWork3.View;

import org.example.homeWork3.Model.Employee;

import java.util.List;

public class AvarageSalary {
    public void show(List<Employee> employeeList){
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.printf("%s result avarage: %s\n",employeeList.get(i).getName(), employeeList.get(i).salaryResult());
        }
        System.out.println("=================");
    }
}
