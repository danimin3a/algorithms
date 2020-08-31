/*Sa se determine si sa se salveze toate numerele prime intr-un int[] array ce va fi returnat de
        functie, mai mici decat un numar dat n, natural.*/

package homework.for_while_switch_Exercises;

public class Ex_7_For {
    public static int[] ArrayP(int bis) {

        int[] a = new int[bis];
        for (int i = 0; i <= a.length; i++) {
            int counter = 0;
            for (int nextprime = 1; nextprime <= bis; nextprime++) {
                if (isPrime(nextprime)) {
                    a[counter] = nextprime;
                    counter++;
                }
            }
            if (a[0] != 0)
                System.out.println(a[i] + " ");
        }
        return a;
    }
    public static boolean isPrime(int nextprime) {
        if (nextprime <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(nextprime); i++) {
            if (nextprime % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(22));
    }
}


