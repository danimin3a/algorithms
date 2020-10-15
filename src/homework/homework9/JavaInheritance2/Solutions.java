package homework.homework9.JavaInheritance2;


import homework.homework9.JavaInheritance2.Adder;
import homework.homework9.JavaInheritance2.Arithmetic;

//https://www.hackerrank.com/challenges/java-inheritance-2/problem
public class Solutions{
    public static void main(String []args){
        Adder adder=new Adder();
        Arithmetic a = new Arithmetic();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
