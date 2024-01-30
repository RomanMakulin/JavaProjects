package org.example.hw1;


import org.example.hw1.others.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.points = points;
    }
}