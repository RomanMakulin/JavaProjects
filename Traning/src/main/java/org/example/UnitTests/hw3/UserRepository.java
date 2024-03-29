package org.example.UnitTests.hw3;

import java.util.ArrayList;
import java.util.List;


public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    protected List<User> data = new ArrayList<>();

    public void addUser(User user) {
       if (user.isAuthenticate) this.data.add(user);
    }

    public List<User> getData() {
        return this.data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logOutAll(){
        for (int i = 0; i < data.size(); i++) {
            if (!data.get(i).isAdmin) {
                data.remove(data.get(i));
                i--;
            }
        }
    }

    public void delUserFromList(User user){
        data.remove(user);
    }

}