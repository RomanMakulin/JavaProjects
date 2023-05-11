package org.example.Controller.FileWork;

import org.example.Model.SalaryInfo;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserNotesRead {
    public List<SalaryInfo> read(String user){
        List<SalaryInfo> salaryInfoList = new ArrayList<>();
        try{

            FileReader reader = new FileReader(user + ".csv");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                salaryInfoList.add(new UserNotesParse().parse(scanner.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return salaryInfoList;
    }
}
