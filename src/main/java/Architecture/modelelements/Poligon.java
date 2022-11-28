package Architecture.modelelements;

// Полигон состоит из коллекции точек и геттеры и сеттеры для задания коллекции

import java.util.Collection;

public class Poligon {
    private Collection<Point3D> points;

    public Collection<Point3D> getPoints() {
        return points;
    }

    public void setPoints(Collection<Point3D> points) {
        this.points = points;
    }
}
