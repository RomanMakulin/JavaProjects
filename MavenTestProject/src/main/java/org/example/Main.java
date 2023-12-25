package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lol", "Kek", 23);

        // LANG 3 task 1
        String name = person.getFirstName();
        System.out.printf("Contains `%s`: %s", 'o', StringUtils.containsAny(name, 'o') + "\n");
        System.out.printf("Count matches `%s`: %s", 'm', StringUtils.countMatches(name, 'm') + "\n");

        // GSON task 2
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(person));
    }
}