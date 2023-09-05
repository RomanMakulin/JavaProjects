package org.example.homeWork3.Controller;

import org.example.homeWork3.Controller.Sorting.SortingAge;
import org.example.homeWork3.Model.Employee;
import org.example.homeWork3.Model.Freelance;
import org.example.homeWork3.Model.Office;
import org.example.homeWork3.Model.Worker;
import org.example.homeWork3.View.AvarageSalary;
import org.example.homeWork3.View.PrintOffice;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick(){

        //region создание воркеров обычных

        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Olga", 40, 100000));
        workerList.add(new Worker("Ivan", 30, 30000));
        workerList.add(new Worker("Petr", 35, 80000));

        // endregion

        //region создание фрилансеров с указанной ЗП по часам

        List<Freelance> freelanceList = new ArrayList<>();
        freelanceList.add(new Freelance("Roman", 25, 7000));
        freelanceList.add(new Freelance("Ann", 22, 2000));
        freelanceList.add(new Freelance("Max", 50, 1000));

        //endregion

        //Создание офиса и объединение работников
        Office office = new Office();
        List<Employee> employeeList = office.addOffice(workerList, freelanceList);

        // Вычисление средней ЗП: (просто выводим в консоль)
        new AvarageSalary().show(employeeList);

        // Печать всех ребят
        new PrintOffice().show(employeeList, office);

        //region Sorting

        employeeList.sort(new SortingAge()); // сортировка по возрасту
//        employeeList.sort(new SortingSalary()); // сортировка по ЗП
//        employeeList.sort(new SortName()); // сортировка по именам

        //endregion

        // Печать всех ребят # 2: после сортировки
        new PrintOffice().show(employeeList, office);
    }
}
