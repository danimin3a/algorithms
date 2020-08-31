package homework.for_while_switch_Exercises;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class Ex2_while {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        System.out.println(randomNum);
        Scanner in = new Scanner(System.in);
        System.out.println("Ghiciti un numar intre 1 si 10.");
        int attempts = 0;
        while (true) {
            System.out.println("Introduceti numarul:");
            int number = in.nextInt();
            attempts += 1;
            if (randomNum == number) {
                System.out.println("Felicitari! Ati ghicit numarul!");
                break;
            } else if (randomNum < number) {
                System.out.println("Numarul cautat este mai mic!");
            } else {
                System.out.println("Numarul cautat este mai mare!");
            }
        }
        System.out.println("Numarul de incercari: " + attempts);
    }
}
