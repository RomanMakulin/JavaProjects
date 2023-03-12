package org.example.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
//        ArrayList<Employee> employeeArrayList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            employeeArrayList.add(new Employee("FIO - " + i, new Random().nextDouble(), "java"));
//        }
//
//        LRUCache<Employee> lru = new LRUCache<>(5);
//        for (Employee e: employeeArrayList ) {
////            System.out.println(e);
//            lru.addElement(e);
//        }
//
//        for (Employee e: lru.getAllElement()) {
//            System.out.println(e);
//        }
//
//        System.out.println();
//        lru.addElement(new Employee("FIO - " + 10, new Random().nextDouble(), "java"));
//        for (Employee e: lru.getAllElement()) {
//            System.out.println(e);
//        }
//
//        System.out.println();
//        System.out.println(lru.getElement(3));

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Anya Novikova", 100000, "Team Leader"));
        employeesList.add(new Employee("Roman Makuin", 450000, "Leader"));
        employeesList.add(new Employee("Olga Makulina", 150000, "Team Leader"));
        employeesList.add(new Employee("Milka Makulina", 25000, "Home cat"));
        employeesList.add(new Employee("Alice bot", 0, "Telegram bot"));

        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println(employeesList.get(i));
        }
        System.out.println();

        LRUCache<Employee> cacheList = new LRUCache<>(2);

        for (Employee item: employeesList) {
            cacheList.addElement(item);
        }


        for (Employee item: cacheList.getAllElement()) {
            System.out.println(item.getInfo());
        }
        System.out.println();

        cacheList.addElement(new Employee("Roman Makuin", 450000, "Leader"));
        cacheList.addElement(employeesList.get(3));

        for (Employee item: cacheList.getAllElement()) {

        }

        for (Employee item: cacheList.getAllElement()) {
            System.out.println(item.getInfo());
        }




    }
}
