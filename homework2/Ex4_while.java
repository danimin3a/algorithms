package homework.for_while_switch_Exercises;

public class Ex4_while {

    // Function to calculate for validity
    public static int checkValidity(int a,
                                    int b, int c) {
        // check condition
        while (true) {
            if (a + b <= c || a + c <= b || b + c <= a)
                return 0;
            else
                return 1;
        }
    }
    // Driver function
    public static void main(String args[]) {

        int a = 7, b = 10, c = 5;

        // function calling and print output
        if ((checkValidity(a, b, c)) == 1)
            System.out.print("Valid");
        else
            System.out.print("Invalid");
    }
}
