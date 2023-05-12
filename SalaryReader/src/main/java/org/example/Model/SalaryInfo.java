package org.example.Model;

import org.example.View.Input.InputNameInfo;
import org.example.View.Input.InputSalary;
import java.util.Date;

public class SalaryInfo {
    private Date date;
    private long salary;
    private String info;

    public SalaryInfo() {
        this.date = new Date();
        this.salary = new InputSalary().print();
        this.info = new InputNameInfo().print();
    }

    public SalaryInfo(Date date, long salary, String info) {
        this.date = date;
        this.salary = salary;
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "date: " + date +
                "\nsalary: " + salary +
                "\ninfo: " + info;
    }
}
