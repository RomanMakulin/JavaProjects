package org.example.Controller.FileWork.Notes;

import org.example.Model.SalaryInfo;

import java.io.FileWriter;
import java.util.List;

public class SaveFile {
    public void save (List<SalaryInfo> salaryInfoList, String name){
        try{
            FileWriter writer = new FileWriter(name + ".csv");
            for (int i = 0; i < salaryInfoList.size(); i++) {
                SalaryInfo note = salaryInfoList.get(i);
                writer.write(note.getDate() + ";" + note.getSalary() + ";" + note.getInfo() + "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
