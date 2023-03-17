package org.example.Core.Infrastructure;

import org.example.Core.Model.Contact;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index){
        return contacts.get(index);
    }

    public void add(Contact contact){
        contacts.add(contact);
    }
}
