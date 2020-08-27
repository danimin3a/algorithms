package homework.for_while_switch_Exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex6_while {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        int upperLimit = 100;
        int lowerLimit = 1;
        String myAnswer = "";

        do {
            randNum = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            System.out.println("I think it's " + randNum);
            myAnswer = in.nextLine();

            if(myAnswer.equals("tl")) {  //too low
                lowerLimit = randNum + 1;
            }
            else if(myAnswer.equals("th")) { // too high
                upperLimit = randNum - 1;
            }
        }while(!myAnswer.equals("y"));

        in.close();
        System.out.println("YAAAY! :D");
    }
}
