package org.example.Model;

import org.example.Controller.FileWork.Notes.NotesRead;
import org.example.View.InputLogin;
import org.example.View.InputPassword;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String password;
    private List<SalaryInfo> salaryInfoList;

    // constructor to create new user
    public User() {
        this.name = new InputLogin().print();
        this.password = new InputPassword().print();
        this.salaryInfoList = new ArrayList<>();
    }

    // constructor for parsing already reg user
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.salaryInfoList = new NotesRead().read(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SalaryInfo> getSalaryInfoList() {
        return salaryInfoList;
    }

    public void setSalaryInfoList(List<SalaryInfo> salaryInfoList) {
        this.salaryInfoList = salaryInfoList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
