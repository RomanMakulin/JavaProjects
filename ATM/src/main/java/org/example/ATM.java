package org.example;

public class ATM {
    User user;
    private String nameAtm;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNameAtm() {
        return nameAtm;
    }

    public void setNameAtm(String nameAtm) {
        this.nameAtm = nameAtm;
    }

    public ATM(User user, String nameAtm) {
        this.user = user;
        this.nameAtm = nameAtm;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "user=" + user +
                ", nameAtm='" + nameAtm + '\'' +
                '}';
    }
}
