package org.example;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * @return Длина вектора точки
     */
    public double LengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param b Точка
     * @return Скалярная сумма точек
     */
    public double ScalMult(Point3D b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }

    /**
     *
     * @param b
     * @return Умножение векторов
     */
    public Point3D MultVector(Point3D b) {
        return new Point3D(y * b.z - z * b.y, z * b.x - x * b.z, x * b.y - y * b.x);
    }

    /**
     *
     * @param b
     * @return Косинус угла
     */
    public double Cos(Point3D b){
        return this.ScalMult(b)/(LengthVector()*b.LengthVector());
    }
}
