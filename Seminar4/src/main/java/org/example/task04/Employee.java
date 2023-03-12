package org.example.task04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee<T extends Number> {
    private String fio;
    private T salary;
    private String jobTitle;

    public String getInfo(){
        return String.format("name: %s, salary: %d, pos: %s", getFio(), getSalary(), getJobTitle());
    }


}