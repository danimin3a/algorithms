//1.Write a function called convertToKilometersPerHour(double milesPerHour)that would return the
//converted value of speed from mile/hour into km/hour.The function definition should be:
//static double convertToKilometersPerHour(double milesPerHour);

package homework.homework3;

import java.util.Scanner;

public class homework3 {
    static double convertToKilometersPerHour(double milesPerHour) {
        // return statement to convert milesPerHour to KilometersPerHour
        if (milesPerHour != 0) {
            return milesPerHour * 1.60934;
        }
        return milesPerHour;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Insert speed in milesPerHour");
        double KilometersPerHour = in.nextDouble();
        System.out.println(KilometersPerHour+" milesPerHour "+"converted into KilometersPerHour = "+convertToKilometersPerHour(KilometersPerHour));
    }
}
