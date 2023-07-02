package org.example.Exeptions.Phonebook.View.Input;

import org.example.Exeptions.Phonebook.View.Exeptions.ErrorInput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateInput implements Input<String> {

    @Override
    public String input() {

        System.out.print("Input Date (dd.mm.yyyy): ");
        String strDate = new Scanner(System.in).next();
        String[] val = strDate.split("\\.");

        if (val.length != 3){
            throw new RuntimeException(new ErrorInput().error());
        }

        if (val[0].length() > 2 || Integer.parseInt(val[0]) > 31 ||
                val[1].length() > 2 || Integer.parseInt(val[1]) > 12 ||
                val[2].length() > 4 || Integer.parseInt(val[2]) > 2023){
            throw new RuntimeException(new ErrorInput().error());
        }

        try {
            SimpleDateFormat dt = new SimpleDateFormat("dd.MM.yyyy");
            Date date = dt.parse(strDate);
            return dt.format(date);
        } catch (ParseException e){
            throw new RuntimeException("Error parsing: " + e);
        }
    }
}
