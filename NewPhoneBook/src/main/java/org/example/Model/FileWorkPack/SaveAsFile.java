package org.example.Model.FileWorkPack;

import org.example.Model.Interfaces.ServiceBook;
import org.example.Model.Models.Phonebook;
import org.example.View.Input;
import java.io.PrintWriter;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SaveAsFile implements ServiceBook {
    @Override
    public void serviceBook(Phonebook book) {
        try {
            PrintWriter writer = new PrintWriter(new Input().input("[Сохранить как] Введите имя файла: "), UTF_8);
            for (int i = 0; i < book.size(); i++) {
                writer.println(book.get(i).getName() + ";" + book.get(i).getPhoneNumber() + ";" + book.get(i).getSalary() + ";" + book.get(i).getComment());
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
