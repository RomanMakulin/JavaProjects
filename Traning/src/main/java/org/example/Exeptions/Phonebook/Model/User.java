package org.example.Exeptions.Phonebook.Model;

import org.example.Exeptions.Phonebook.View.Exeptions.ErrorInput;
import org.example.Exeptions.Phonebook.View.Exeptions.NullData;
import org.example.Exeptions.Phonebook.View.Input.DateInput;
import org.example.Exeptions.Phonebook.View.Input.Name;
import org.example.Exeptions.Phonebook.View.Input.PhoneInput;
import org.example.Exeptions.Phonebook.View.Input.SexInput;

import java.util.InputMismatchException;

public class User {
    private String fio;
    private String date;
    private long phone;
    private String sex;

    public User(String fio, String date, long phone, String sex) {
        this.fio = fio;
        this.date = date;
        this.phone = phone;
        this.sex = sex;
    }

    public User() {
        try {

            this.fio = new Name().input();

            this.date = new DateInput().input();

            this.phone = new PhoneInput().input();

            this.sex = new SexInput().input();

        } catch (InputMismatchException e){
            throw new RuntimeException(new ErrorInput().error());
        } catch (NullPointerException e){
            throw new RuntimeException(new NullData().error());
        }

    }

    public String getLastName(){
        String[] value = fio.split(" ");
        return value[1];
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "fio='" + fio + '\'' +
                ", date=" + date +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +
                '}';
    }
}
