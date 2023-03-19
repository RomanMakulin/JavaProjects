package org.example.Library.Impl;

import org.example.Library.Book;
import org.example.Library.ElectronBook;

import java.util.List;

public class JSONFormater implements Formater{
    @Override
    public String format(List<ElectronBook> book) {
        return "JSON " + book.toString();
    }
}
