package homework.homework4;

public class Ex1_rangeSum {
    static int rangeSum(int start, int end, int divisor) {
        int sum = 0;
        if (start > end) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isDivisible(i, divisor)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    static boolean isDivisible(int number, int divisor) {
        boolean divisibil = false;
        if (number % divisor == 0) {
            divisibil = true;
        }
        return divisibil;
    }

    public static void main(String[] args) {
        System.out.println(rangeSum(1, 5, 2));
    }
}
