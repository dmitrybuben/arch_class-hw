package Architecture.modelelements;

import java.util.Collection;

public class Camera {
    private Collection<Point3D> location;
    private Collection<Angle3D> angle;
    private void Rotate(Angle3D angle){}
    private void Move(Point3D points){}

    public void setLocation(Collection<Point3D> location) {
        this.location = location;
    }

    public void setAngle(Collection<Angle3D> angle) {
        this.angle = angle;
    }
}
