package org.example.Core.Models;

import org.example.Mathematics.CalculateArea.Calculate;
import org.example.Mathematics.Shapes.Canvas;
import org.example.Mathematics.Shapes.Shape;
import org.example.Mathematics.CalculateArea.CalculateArea;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(CalculateArea c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
