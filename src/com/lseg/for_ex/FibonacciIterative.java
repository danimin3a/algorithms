package com.lseg.for_ex;

public class FibonacciIterative {
    public static int fibonacciLoop(int nthElement) {
        //use loop
        int An, An_1 = 0, An_2 = 1;

        for (int n= 1; n < nthElement ; n++) {

            An = An_1;

            An_1 = An_2;

            An_2 = An + An_1;

        }
        return An_2;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciLoop(6));
    }
}
