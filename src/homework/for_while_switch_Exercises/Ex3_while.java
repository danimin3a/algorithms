package homework.for_while_switch_Exercises;

import java.util.Scanner;

public class Ex3_while {
    public static void main(String arg[]) {
        int n, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many numbers you want sum");
        n = sc.nextInt();
        if (n != 0) {
            int a[] = new int[n];

            System.out.println("enter the " + n + " numbers ");
            while (n == 0) {
                break;
            }
            if (n != 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println("enter  number  " + (i + 1) + ":");
                    a[i] = sc.nextInt();
                    sum += a[i];
                    System.out.println("sum is: " + sum);
                    if (a[i] == 0) {
                        break;
                    }
                }
            }
        }
    }
}



