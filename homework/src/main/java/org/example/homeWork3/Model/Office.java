package org.example.homeWork3.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Office implements Iterable<Employee>{
    List<Employee> employeeList;
    public Office() {
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> addOffice(List<Worker> workerList, List<Freelance> freelanceList){
        employeeList = Stream.concat(workerList.stream(), freelanceList.stream()).collect(Collectors.toList());
        return employeeList;
    }

    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

}
