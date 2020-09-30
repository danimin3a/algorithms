package homework.homework7.Ex1;

public class Vehicle {
    public String color;
    public int doors;
    public boolean tuning;
    public boolean electric;

    public Vehicle(String color, int doors, boolean tuning, boolean electric) {
        super();
        this.color = color;
        this.doors = doors;
        this.tuning = tuning;
        this.electric = electric;
    }

    public void steering() {
        System.out.println("Car is steering");
    }

    public void ChangingGears() {
        System.out.println("Vehicle is changing gears");
    }

    public void moving(int speed) {
        System.out.println("Vehicle is moving");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isTuning() {
        return tuning;
    }

    public void setTuning(boolean tuning) {
        this.tuning = tuning;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
