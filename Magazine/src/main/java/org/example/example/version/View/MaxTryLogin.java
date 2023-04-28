package org.example.example.version.View;

public class MaxTryLogin {
    public void error(int maxTry){
        maxTry--;
        System.out.printf("Неверный логин или пароль!\nПопыток осталось: %d\n", maxTry);
    }
}
