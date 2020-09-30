package homework.homework7.Ex1;

import homework.homework7.Ex1.Car;
import homework.homework7.Ex1.Vehicle;

public class Volkswagen extends Car {


    public Volkswagen(String color, int doors, boolean tuning, boolean electric) {
        super(color, doors, tuning, electric);
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("white",4, true,true);
        myVehicle.steering();
        myVehicle.ChangingGears();
        myVehicle.moving(100);

        Car volkswagen = new Car("white",4, false,false);
        System.out.println(volkswagen.getWheels());
        volkswagen.moving(130);
        volkswagen.steering();
        System.out.println(volkswagen.getWheels());

        }
    }
