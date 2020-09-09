/*2. We have a dog that likes to bark. And, we need to wake up if the dog is barking at night.
Write a function shouldWakeUp that has 2 parameters:
• 1st parameter: barking is of type boolean and it represents if our dog is currently barking
• 2nd parameter: hour represents the hour of day and has a valid range between 0-23
We have to wake up only if the dog barks before 8 and after 22 hours, in which case should return
true, and false otherwise.
The function definition should be:
static boolean shouldWakeUp(boolean barking, int hour)*/

package homework.homework3;

import java.util.Scanner;

public class Ex2_shouldWakeUp {
    static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Wrong value. Insert from 0 to 23!");
        } else if (hour <= 8 || hour >= 22) {
            return true;
        } else {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a time when dog is barking: ");
        int time = in.nextInt();
        System.out.println(shouldWakeUp(true, time));
    }
}
