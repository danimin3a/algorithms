//1.Write a function called convertToKilometersPerHour(double milesPerHour)that would return the
//converted value of speed from mile/hour into km/hour.The function definition should be:
//static double convertToKilometersPerHour(double milesPerHour);

package homework.homework3;


import java.util.Scanner;

public class Ex1_convertToKilometersPerHour {
    static double convertToKilometersPerHour(double milesPerHour) {
        // return statement to convert milesPerHour to KilometersPerHour
        if (milesPerHour >= 0) {
            milesPerHour = milesPerHour * 1.60934;
        } else {
            System.out.println("invalid input");
            return 0.0;
        }
        return milesPerHour;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert speed in milesPerHour");
        double KilometersPerHour = in.nextDouble();
        System.out.println(KilometersPerHour + " milesPerHour " + "converted into KilometersPerHour = " + convertToKilometersPerHour(KilometersPerHour));
    }
}
