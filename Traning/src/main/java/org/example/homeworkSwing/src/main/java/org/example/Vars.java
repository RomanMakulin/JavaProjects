package org.example;

public class Vars {
    private String IP;
    private String PORT;
    private String NAME;
    private String PASSWORD;

    public Vars() {
        this.IP = "127.0.0.1";
        this.PORT = "8189";
        this.NAME = "Roman_Makulin";
        this.PASSWORD = "123";
    }

    public String getIP() {
        return IP;
    }

    public String getPORT() {
        return PORT;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
