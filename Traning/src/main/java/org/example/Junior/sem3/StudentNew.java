package org.example.Junior.sem3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StudentNew implements Externalizable {

    protected String name;
    protected int age;
    protected transient double gpa;

    public StudentNew(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public StudentNew() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(age);
        out.writeObject(gpa);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = (int) in.readObject();
        gpa = (double) in.readObject();
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
