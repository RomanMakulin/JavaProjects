package org.example.example.Model.Interfaces;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;

import java.util.List;

public interface Contest {
    void contest(List<Athletes> athletes, List<Barriers> barriers);
}
