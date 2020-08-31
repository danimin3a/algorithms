package homework.homework2;

import java.util.Scanner;

public class Ex5_while {
        public static void main(String args[]){
            int r,sum=0,temp;
            Scanner no=new Scanner(System.in);
            System.out.println("Inset an integer number: ");
            int n=no.nextInt(); // it is the number to check for palindrome
            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
    }
