package homework.homework7.Ex2;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getVolume() {
        return this.height * getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
