package org.example.Exeptions.Phonebook.View.Input;

import java.text.ParseException;

public interface Input <T> {
    public T input() throws ParseException;
}
