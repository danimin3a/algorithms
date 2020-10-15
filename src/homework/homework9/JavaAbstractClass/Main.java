package homework.homework9.JavaAbstractClass;

import homework.homework9.JavaAbstractClass.MyBook;
//https://www.hackerrank.com/challenges/java-abstract-class/problem
import java.util.Scanner;

public class Main{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}
