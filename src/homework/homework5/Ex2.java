package homework.homework5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;
        char choice;
        do {
            System.out.print("Enter the number ");
            number = in.nextInt();
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = in.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}
