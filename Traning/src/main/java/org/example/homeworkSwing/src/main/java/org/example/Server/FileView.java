package org.example.Server;

import java.util.ArrayList;

public interface FileView {
    public void fileRead(ArrayList<String> stringList);
    public void sendLog(String line);
}
