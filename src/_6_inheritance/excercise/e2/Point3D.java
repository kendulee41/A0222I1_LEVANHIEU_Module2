package _6_inheritance.excercise.e2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {getX(), getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return "x= " + getX()
                + "\ny= " + getY()
                + "\nz= " + z;
    }
}
