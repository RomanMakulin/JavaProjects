package org.example.hw1;

import org.example.hw1.others.Type;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras){

    }

    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }

}