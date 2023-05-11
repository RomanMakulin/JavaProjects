package org.example.Model;

import org.example.Controller.FileWork.UserNotesRead;
import org.example.View.InputLogin;
import org.example.View.InputPassword;

import java.util.List;

public class User {
    private String name;
    private String password;
    private List<SalaryInfo> salaryInfoList;

    public User() {
        this.name = new InputLogin().print();
        this.password = new InputPassword().print();
        this.salaryInfoList = new UserNotesRead().read(name);
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
}
