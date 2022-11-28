package org.example.modelelements;

/*
для работы с Angle3D (углами) нужно понятие вектора - определение величины (точки) и направления
от начальной точки нулевой как бы проведем линию к этой точке и таким образом зададим направление - вектор
угол - это нечто между 2 векторами
*/

public class Vector3D {

    private Point3D point;

    public Point3D getPoint() {
        return point;
    }

    public void setPoint(Point3D point) {
        this.point = point;
    }

    public Vector3D(Point3D point) {
        this.point = point;
    }

}
