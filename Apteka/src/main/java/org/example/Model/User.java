package org.example.Model;

public abstract class User {
    private String name;
    private int password;
    Pharmacy pharmacy;


    public User(String name, int password, Pharmacy pharmacy) {
        this.name = name;
        this.password = password;
        this.pharmacy = pharmacy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
}
