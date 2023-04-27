package org.example.Controller.FilesWork.Config;
import org.example.Model.Interfaces.FileReadWrite;

public class PathWrite implements FileReadWrite {
    @Override
    public String cfg() {
        return "my-items.csv";
    }
}
