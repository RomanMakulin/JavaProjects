package org.example.homeWork3.Model;

public class Worker extends Employee{
   protected String status;

    public Worker(String name, int age, int salary) {
        super(name, age, salary);
        this.status = "Нормированный график бедолаг";
    }

    @Override
    public double salaryResult() {
        return super.salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
