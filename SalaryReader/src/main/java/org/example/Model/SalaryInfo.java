package org.example.Model;

import org.example.View.InputNameInfo;
import org.example.View.InputSalary;

import java.util.Date;

public class SalaryInfo {
    private Date date;
    private long salary;
    private String info1;
    private String info2;
    private String info3;

    public SalaryInfo() {
        this.date = new Date();
        this.salary = new InputSalary().print();
        this.info1 = new InputNameInfo().print();
        this.info2 = new InputNameInfo().print();
        this.info3 = new InputNameInfo().print();
    }

    public SalaryInfo(Date date, long salary, String info1, String info2, String info3) {
        this.date = date;
        this.salary = salary;
        this.info1 = info1;
        this.info2 = info2;
        this.info3 = info3;
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

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    @Override
    public String toString() {
        return "date: " + date +
                "\nsalary: " + salary +
                "\ninfo1: " + info1 +
                "\ninfo2: " + info2 +
                "\ninfo3: " + info3;
    }
}
