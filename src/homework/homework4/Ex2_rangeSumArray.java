package homework.homework4;

import java.util.Arrays;

public class Ex2_rangeSumArray {

    public static class Ex2_rangeSum {
        static int rangeSum(int[] array,int divisor){

            int[] ar = new int[]{9,2,10,11,7};
            Arrays.sort(ar);
            int sum=0;

            for(int i=0;i<=ar.length-1;i++){
                if (isDivisible(i,divisor)) {
                    sum = sum+ i;
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
            System.out.println(rangeSum(new int[]{1,5},2));
        }
    }

}
