package com.lseg.for_ex.basic_Structures;

public class WhileEx {
    public static void main(String[] args) {
        System.out.println(7/2);
    }

    static void printNumberDigits(int n) {
        if (n == 0) {
            System.out.println("The number is 0");
            return;
        }
        if (n < 0) {
            n = n * (-1);
        }
        while (n!=0) {
            int digit = n % 10; // restul impartirii nr la 10
            System.out.print(digit + ",");
        }
    }
}
