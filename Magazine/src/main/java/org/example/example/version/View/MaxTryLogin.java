package org.example.example.version.View;

public class MaxTryLogin {
    public void error(int maxTry){
        maxTry--;
        System.out.printf("Wrong login or password!\nYou are have any attempts: %d\n", maxTry);
    }
}
