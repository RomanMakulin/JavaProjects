package org.example.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.example.Core.Models.Contact;

public class Phonebook {

    private List<Contact> contacts;
    
    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read
    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update
    public boolean updContact(int index, Contact contact) {
        boolean flag = false;
        if (contacts.contains(contacts.get(index))) {
            contacts.remove(contacts.get(index));
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {

        return contacts;
    }


    public int count() {
        return contacts.size();
    }

}
