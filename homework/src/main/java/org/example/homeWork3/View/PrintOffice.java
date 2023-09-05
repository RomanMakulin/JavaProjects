package org.example.homeWork3.View;

import org.example.homeWork3.Model.Employee;
import org.example.homeWork3.Model.Office;

import java.util.List;

public class PrintOffice {
    public void show(List<Employee> employeeList, Office office){
        System.out.println();
        for (Employee o: employeeList) {
            if (office.iterator().hasNext()){
                System.out.println(o);
            }
        }
    }
}
