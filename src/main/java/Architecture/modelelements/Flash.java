package Architecture.modelelements;

import java.util.Collection;

public class Flash {
    private Collection<Point3D>location;
    private Collection<Angle3D> angle;
    private Collection<Color> color;
    private float power;

    private void Rotate(Angle3D angle){}
    private void Move(Point3D points){}

    public void setLocation(Collection<Point3D> location) {
        this.location = location;
    }

    public void setAngle(Collection<Angle3D> angle) {
        this.angle = angle;
    }

    public void setColor(Collection<Color> color) {
        this.color = color;
    }

    public void setPower(float power) {
        this.power = power;
    }
}
