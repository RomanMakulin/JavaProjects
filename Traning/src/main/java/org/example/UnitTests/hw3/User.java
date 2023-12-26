package org.example.UnitTests.hw3;

public class User {

    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.isAdmin = false;
    }

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public void authenticate(String name, String password) {
        isAuthenticate = this.name.equals(name) & this.password.equals(password);
    }

    public void loginOut(){
        if (!isAdmin) isAuthenticate = false;
        else System.out.println("Error: you are admin.");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isAuthenticate=" + isAuthenticate +
                '}';
    }
}