package org.example;

public class Main {
    public static void main(String[] args) {

        Point3D pointA = new Point3D(2, 3, 4);
        Point3D pointB = new Point3D(3, 4, 5);

        System.out.println(pointA.LengthVector());

        System.out.println(pointA.ScalMult(pointB));

        System.out.println(pointA.MultVector(pointB).getX() + ", "
                + pointA.MultVector(pointB).getY() + ", " + pointA.MultVector(pointB).getZ() + ", ");

        System.out.println(pointA.Cos(pointB));

    }
}