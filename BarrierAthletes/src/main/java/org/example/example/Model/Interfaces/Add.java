package org.example.example.Model.Interfaces;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import java.util.ArrayList;
import java.util.List;

public interface Add<T> {
    List<Barriers> barriers = new ArrayList<>();
    List<Athletes> athletes = new ArrayList<>();
    List<T> add();
}
