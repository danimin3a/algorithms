/*Write a function called is rangeSum, using while loop, that will sum up all the numbers from a range that are
divisible with a given number. Should have 3 int parameters start, end and divisor, from which, the
first two represent te edges of a range of numbers, and respectively, the number that should be
checked against numbers if they are divisible with it.*/
//To convert FOR in WHILE: For(ForInit;Expression;ForUpdate)Statement ->
// ForInit;
// while(Expression){
// Statement;
// ForUpdate
// }
package homework.homework5;

public class Ex4 {
    static int rangeSum(int start, int end, int divisor) {
        int sum = 0;
        if (start > end) {
            return -1;
        } else {
            int i = start;

            while (i <= end) {
                {
                    if (isDivisible(i, divisor)) {
                        sum += i;
                    }
                    i++;
                }
            }
            return sum;
        }
    }
    private static boolean isDivisible(int number, int divisor) {
        boolean divisible = false;
        if (number % divisor == 0) {
            divisible = true;
        }
        return divisible;
    }

    public static void main(String[] args) {
        System.out.println(rangeSum(2, 5, 2));
    }
}
