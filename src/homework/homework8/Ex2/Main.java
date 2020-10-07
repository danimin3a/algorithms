package homework.homework8.Ex2;

public class Main {

        public static void main(String[] args) {

            regularBurger myOrder = new regularBurger("Rye", 1); //although this code isn't the best, 0-3 patties work seamlessly

            myOrder.makeOrder(true, true, true, true,
                    false, true);

            System.out.println("\n");

            healthyBurger otherOrder = new healthyBurger(1);

            otherOrder.makeOrder(true, true, true, true, true, true);

            System.out.println("\n");

            deluxeBurger finalOrder = new deluxeBurger();

            finalOrder.makeOrder(true, true, true, true, true, true);
        }
    }
