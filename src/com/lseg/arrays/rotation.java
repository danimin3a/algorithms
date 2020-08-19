package com.lseg.arrays;

import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului");
        int n = scan.nextInt();
        System.out.println("Introduceti numarul de rotatii dorite");
        int d = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Introduceti array-ul");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        if (d % n == 0) {
            printOriginalArray(a);
        } else {
            d = d % n;
            for (int i = 0; i < n; i++) {
                b[i] = a[(i + d) < n ? (i + d) : ((i + d) - n)];
                System.out.print(b[i] + " ");
            }
        }
    }

    private static void printOriginalArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
