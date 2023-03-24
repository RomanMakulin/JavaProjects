package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    List<Contact> contactList;

    public Phonebook() {
        contactList = new ArrayList<Contact>();
    }

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public void delete(Contact contact){
        contactList.remove(contact);
    }

    public Contact get(int index){
        return contactList.get(index);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("PhoneBook contact list:\n");
        for (int i = 0; i < contactList.size(); i++) {
            str.append(contactList.get(i));
        }
        return str.toString();
    }
}
