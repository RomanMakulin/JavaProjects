package org.example.Core.Models;



public class Contact  implements Comparable<Contact> {
    public String name;
    public String phone;
    public int salary;
    public String company;
    //public Email email;
    public String email;

    public Contact(String name, String phone, int salary, String company, String email) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.company = company;
        this.email = email;
    }

// добавить возможность создания объектов с бОльшим
    // количеством параметров

    @Override
    public int compareTo(Contact o) {
        // ???...
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.name == t.name
                && this.phone == t.phone
        ;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "phone: " + phone +
                "salary: " + salary +
                "company: " + company +
                "email: " + email;
    }
}
