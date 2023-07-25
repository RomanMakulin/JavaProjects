package org.example.Model;

import java.sql.Date;
import java.util.List;

public class Animal {
    protected int id;
    protected String name;
    protected List<String> commandsList;
    protected String bith;
    protected String oldTable;

    public Animal(String name, List<String> commandsList, String bith, String oldTable) {

        this.name = name;
        this.commandsList = commandsList;
        this.bith = bith;
        this.oldTable = oldTable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommandsList() {
        return commandsList;
    }

    public void setCommandsList(List<String> commandsList) {
        this.commandsList = commandsList;
    }

    public String getBith() {
        return bith;
    }

    public void setBith(String bith) {
        this.bith = bith;
    }

    public String getOldTable() {
        return oldTable;
    }

    public void setOldTable(String oldTable) {
        this.oldTable = oldTable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", commandsList=" + commandsList +
                ", bith=" + bith +
                ", oldTable='" + oldTable + '\'' +
                '}';
    }
}
