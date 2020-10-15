package homework.homework9.JavaInterface;

import homework.homework9.JavaInterface.AdvancedArithmetic;

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
