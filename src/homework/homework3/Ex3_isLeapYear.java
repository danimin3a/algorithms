package homework.homework3;

import java.util.Scanner;

public class Ex3_isLeapYear {
    static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Insert a valid year, from 1 to 9999 to check if is leap year(true) or not(false):");
        int year=in.nextInt();
        System.out.println(isLeapYear(year));
    }
}
