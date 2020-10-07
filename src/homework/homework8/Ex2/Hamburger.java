package homework.homework8.Ex2;

public class Hamburger {
    private String bread;
    private int meat;
    public double price;

    public Hamburger(String bread, int meat) {
        this.bread = bread;
//        this.meat = meat;

        if (meat > 3) { //no bigger than triple burger; we are not serving n-patty burgers
            this.meat = 3;
        } else {
            this.meat = meat;
        }
    }

    public String getBread() {
        return bread;
    }

    public int getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double makeOrder(boolean opt1, boolean opt2, boolean opt3,
                            boolean opt4, boolean opt5, boolean opt6) { //kill me now

        return price;
    }
}

class regularBurger extends Hamburger {

    public regularBurger(String bread, int meat) {
        super(bread, meat);
    }

    @Override
    public double makeOrder(boolean lettuce, boolean tomato, boolean onion,
                            boolean cheese, boolean opt5, boolean opt6) {
        price = 0.00;

        if (getMeat() > 1) {
            price += 4.50;
            price += (getMeat()-1) * 1.25;
            System.out.println("Regular " + getBread() + " burger: 4.50 \nExtra meat: " + (getMeat()-1) * 1.25);
        }

        if (getMeat() == 1) {
            price += 4.50;
            System.out.println("Regular " + getBread() + " burger: 4.50");
        }

        if (getMeat() == 0) {
            price += 1.25;
            System.out.println(getBread() + " veggie " + " burger: 1.25");
        }

        if (lettuce) {
            price += .25;
            System.out.println("Lettuce: .25");
        } else {
            System.out.println("");
        }

        if (tomato) {
            price += .35;
            System.out.println("Tomato: .35");
        } else {
            System.out.println("");
        }

        if (onion) {
            price += .20;
            System.out.println("Onion: .20");
        } else {
            System.out.println("");
        }

        if (cheese) {
            price += .75;
            System.out.println("Cheese: .75");
        } else {
            System.out.println("");
        }


        System.out.println("Total: " + price);
        return price;
    }
}

class healthyBurger extends Hamburger {
    public healthyBurger(int meat) {
        super("Wheat", meat);
    }

    @Override
    public double makeOrder(boolean lettuce, boolean tomato, boolean onion,
                            boolean cheese, boolean kale, boolean mushroom) {
        price = 0.00;

        if (getMeat() > 1) {
            price += 4.50;
            price += (getMeat()-1) * 1.25;
            System.out.println("Healthy " + getBread() + " burger: 4.50 \nExtra meat: " + (getMeat()-1) * 1.25);
        }

        if (getMeat() == 1) {
            price += 4.50;
            System.out.println("Healthy " + getBread() + " burger: 4.50");
        }

        if (getMeat() == 0) {
            price += 1.25;
            System.out.println("Healthy "+ getBread() + " veggie " + "burger: 1.25");
        }


        if (lettuce) {
            price += .25;
            System.out.println("Lettuce: .25");
        } else {
            System.out.println("");
        }

        if (tomato) {
            price += .35;
            System.out.println("Tomato: .35");
        } else {
            System.out.println("");
        }

        if (onion) {
            price += .20;
            System.out.println("Onion: .20");
        } else {
            System.out.println("");
        }

        if (cheese) {
            price += .75;
            System.out.println("Cheese: .75");
        } else {
            System.out.println("");
        }

        if (kale) {
            price += .90;
            System.out.println("Kale: .90");  //here "opt5 and opt6 turn into two add-ons
        } else {
            System.out.println("");
        }

        if (mushroom) {
            price += .65;
            System.out.println("Mushroom: .65");
        } else {
            System.out.println("");
        }

        System.out.println("Total: " + price);
        return price;
    }
}

class deluxeBurger extends Hamburger {

    public deluxeBurger() {
        super("", 1);
    }

    @Override
    public double makeOrder(boolean chips, boolean drink, boolean cant, // unused because the assignment specifies so
                            boolean let_you, boolean do_that, boolean starfox) {
        System.out.println("Deluxe Hamburger Combo: 8.25 ");
        return price; //useless return
    }
}
