package homework.homework7.Ex1;

public class Car extends Vehicle {
    private int wheels;
    private boolean convertible;
    private boolean runFlatTyres;

    public Car(String color, int doors, boolean tuning, boolean electric) {
        super(color, doors, tuning, electric);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean getRunFlatTyres() {
        return runFlatTyres;
    }

    public void setRunFlatTyres(boolean runFlatTyres) {
        this.runFlatTyres = runFlatTyres;
    }
}
