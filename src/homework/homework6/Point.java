package homework.homework6;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("Default constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /** Returns the distance to the origin */
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    /** Returns the distance to another point */
    public double distance(Point another) {
        double x1;
        double y1;
        x1 = x - another.getX();
        y1 = y - another.getY();
        return Math.sqrt(x1 * x1 + y1 * y1);
    }
}
