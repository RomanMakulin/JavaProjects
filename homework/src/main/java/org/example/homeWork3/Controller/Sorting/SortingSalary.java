package org.example.homeWork3.Controller.Sorting;

import org.example.homeWork3.Model.Employee;

import java.util.Comparator;

public class SortingSalary implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() == o2.getSalary()) return 0;
        else if (o1.getSalary() < o2.getSalary()) return 1;
        return -1;
    }
}
