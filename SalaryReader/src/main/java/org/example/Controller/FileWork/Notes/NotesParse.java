package org.example.Controller.FileWork.Notes;

import org.example.Model.SalaryInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class NotesParse {
    public SalaryInfo parse(String line) {

        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();

        Date date = new Date();

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
            date = formatter.parse(values[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new SalaryInfo(date, Integer.parseInt(values[1]), values[2]);

    }
}
