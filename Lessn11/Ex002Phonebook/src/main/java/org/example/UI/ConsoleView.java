package org.example.UI;

import java.util.Scanner;

import org.example.Core.MVP.View;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public String getName() {
        System.out.printf("Name: ");
        return in.nextLine();
    }

    @Override
    public void setName(String value) {
        System.out.printf("Name: %s\n", value);
    }

    @Override
    public String getPhone() {
        System.out.printf("Phone: ");
        return in.nextLine();
    }

    @Override
    public void setPhone(String value) {
        System.out.printf("Phone: %s\n", value);
    }

    @Override
    public int getSalary() {
        System.out.printf("Salary: ");
        return Integer.parseInt(in.nextLine());
    }

    @Override
    public void setSalary(int value) {
        System.out.printf("Salary: %d\n", value);
    }


    @Override
    public String getCompanyName() {
        System.out.printf("Company: ");
        return in.nextLine();
    }

    @Override
    public void setCompanyName(String value) {
        System.out.printf("Company: %s\n", value);
    }

    @Override
    public String getEmail() {
        System.out.printf("Email: ");
        return in.nextLine();
    }

    @Override
    public void setEmail(String value) {
        System.out.printf("Email: %s\n", value);
    }

    @Override
    public void setSalary(String value) {
        System.out.printf("Salary: %s\n", value);
    }


}
