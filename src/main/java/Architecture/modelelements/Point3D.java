package org.example.modelelements;

public class Point3D {

/*
Три поля координат и геттеры и сеттеры для изменения координат и 2 конструктора - 1 для задания координаты точки,
второй - для задания стандартной точки с координатами 0,0,0
*/
    private double x,y,z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {}
}
