package org.example.homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Backup {
    protected String sourceDirPath;
    protected String finishDirPath;


    public Backup(String sourceDirPath, String finishDirPath) {
        this.sourceDirPath = sourceDirPath;
        this.finishDirPath = finishDirPath;
    }

    public File create (){
        File file = new File(finishDirPath);
        file.mkdir();
        return file;
    }

    public File[] getDirs(){
        File sourceDir = new File(sourceDirPath);
        return sourceDir.listFiles();
    }

    public void copy() throws IOException {
        File backupDir = create();
        File[] filesToBackup = getDirs();

        for (File file : filesToBackup) {
            if (file.isFile()) {
                Files.copy(file.toPath(), new File(backupDir.getPath() + "/" + file.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }


}
