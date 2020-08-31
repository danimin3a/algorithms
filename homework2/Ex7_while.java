package homework.for_while_switch_Exercises;

import java.util.Arrays;
import java.io.Console;

public class Ex7_while {
        public static void main(String[] args) {

            int counter = 3;
            int attempt = 3;
            char[] ch = null;
            Console c=System.console();
            System.out.println("Enter PIN: ");
            ch=c.readPassword();
            String pass=String.valueOf(ch);
            if(pass.equals("1234")){
                System.out.println("Correct PIN entered!");
            }
            while(!pass.equals("1234") && attempt != 0){
                System.out.println("Invalid PIN entered!. " + --attempt + " attempts remaining.");
                counter--;
                if(attempt != 0){
                    c=System.console();
                    System.out.println("Enter PIN: ");
                    ch=c.readPassword();
                    pass=String.valueOf(ch);
                    if(pass.equals("1234")){
                        System.out.println("Correct PIN entered!");
                    }
                }
                else{
                    System.out.println("your card has locked!");
                    break;
                }
            }
        }
    }
