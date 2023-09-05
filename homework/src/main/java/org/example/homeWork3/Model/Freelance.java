package org.example.homeWork3.Model;

public class Freelance extends Employee {
    public Freelance(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public double salaryResult() {
        return super.salary * 20.0 * 8;
    }
}
