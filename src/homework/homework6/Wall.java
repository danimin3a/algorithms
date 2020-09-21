package homework.homework6;

public class Wall {
    private double width;
    private double height;

    //no-arg or default constructor
    public Wall() {
        System.out.println("This is default constructor");
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
            //  return;
        }
        if (height < 0) {
            this.height = 0;
            //  return;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
            System.out.println("-!- width set < 0 -> then width = 0");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
            System.out.println("-!- height set < 0 -> then height = 0");
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
