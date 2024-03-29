package org.example.hw1;

import org.example.hw1.others.Point3D;
import org.example.hw1.others.Texture;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures) {
        Textures = textures;
        Poligons = new ArrayList<>();
        Poligons.add(new Poligon((List<Point3D>) new Point3D()));
    }
}