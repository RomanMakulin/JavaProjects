package org.example.Controller.FileWork;

import org.example.Model.SalaryInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UserNotesParse {
    public SalaryInfo parse(String line) throws ParseException {

        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();

        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        Date date = formatter.parse(values[0]);

        return new SalaryInfo(date, Integer.parseInt(values[1]), values[2], values[3], values[4]);

    }
}
