package org.example.Model.Interfaces;

import org.example.Model.Card;

import java.util.List;

public interface ReadFile <T> {
    public List<T> generate(String path);
}
