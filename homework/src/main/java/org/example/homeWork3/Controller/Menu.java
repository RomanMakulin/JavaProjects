package org.example.homeWork3.Controller;

import org.example.homeWork3.Controller.Sorting.SortName;
import org.example.homeWork3.Controller.Sorting.SortingAge;
import org.example.homeWork3.Controller.Sorting.SortingSalary;
import org.example.homeWork3.Model.Employee;
import org.example.homeWork3.View.Menu.InputAction;
import org.example.homeWork3.View.Menu.MenuSortingView;

import java.util.List;

public class Menu {
    public void menu(List<Employee> employeeList){
        new MenuSortingView().showMenu();
        switch (new InputAction().input()) {
            case 1 -> employeeList.sort(new SortingAge());
            case 2 -> employeeList.sort(new SortingSalary());
            case 3 -> employeeList.sort(new SortName());
        }
    }
}
