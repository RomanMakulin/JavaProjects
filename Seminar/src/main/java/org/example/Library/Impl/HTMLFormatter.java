package org.example.Library.Impl;

import org.example.Library.Book;
import org.example.Library.ElectronBook;

import java.util.List;

public class HTMLFormatter implements Formater{
    @Override
    public String format(List<ElectronBook> book) {
        return "HTML " + book.toString();
    }
}
