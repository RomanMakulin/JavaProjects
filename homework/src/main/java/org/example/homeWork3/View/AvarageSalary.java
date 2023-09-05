package org.example.homeWork3.View;

import org.example.homeWork3.Model.Employee;

import java.util.List;

public class AvarageSalary {
    public void show(List<Employee> employeeList){
        for (Employee employee : employeeList) {
            System.out.printf("%s result avarage: %s\n", employee.getName(), employee.salaryResult());
        }
    }
}
