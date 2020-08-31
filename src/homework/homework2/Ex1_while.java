package homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        System.out.println(randomNum);
        Scanner in = new Scanner(System.in);
        System.out.println("Ghiciti un numar intre 1 si 10.");
        while (true) {
            System.out.println("Introduceti numarul:");
            int number = in.nextInt();
            if (randomNum == number) {
                System.out.println("Felicitari! Ati ghicit numarul!");
                break;
            } else if (randomNum < number) {
                System.out.println("Numarul cautat este mai mic!");
            } else {
                System.out.println("Numarul cautat este mai mare!");
            }
        }
    }
}
