package org.example.homeWork3.Controller.Sorting;

import org.example.homeWork3.Model.Employee;

import java.util.Comparator;

public class SortingAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() == o2.getAge()) return 0;
        else if (o1.getAge() < o2.getAge()) return 1;
        return -1;
    }

}
