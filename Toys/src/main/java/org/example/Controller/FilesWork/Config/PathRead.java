package org.example.Controller.FilesWork.Config;

import org.example.Model.Interfaces.FileReadWrite;

public class PathRead implements FileReadWrite {
    @Override
    public String cfg() {
        return "toys.csv";
    }
}
