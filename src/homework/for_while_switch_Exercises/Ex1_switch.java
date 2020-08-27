package homework.for_while_switch_Exercises;

import java.util.Scanner;

public class Ex1_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 0 si 6");
        int number = in.nextInt();
        switch (number) {
            case 0:
                System.out.println("Duminica");
                break;
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            default:
                System.out.println("Numarul trebuie sa fie intre 0 si 6");
        }
    }
}
