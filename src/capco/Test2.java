package capco;

/**
 * Created by Alex on 9/7/2016.
 */
public class Test2 {
    static class FoodFactory {
        public Food newFood(String a) {
            Food food = null;
            if (a.equals("Fruits")) {
                food = new Fruits();
            } else if (a.equals("FastFood")) {
                food = new FastFood();
            }

            return food;
        }

    }

    static class Food {
        public void serveFood() {}
    }

    static class FastFood extends Food {
        public void serveFood() {
            System.out.println("I'm serving Fastfood");
        }

    }

    static class Fruits extends Food {
        public void serveFood() {
            System.out.println("I'm serving Fruits");
        }
    }

    public static void main(String[] args) {
        FoodFactory fc = new FoodFactory();
        Food food1 = fc.newFood("Fruits");
        Food food2 = fc.newFood("FastFood");

        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());

        System.out.println("My superclass is : " + food1.getClass().getSuperclass().getName());

        food1.serveFood();
        food2.serveFood();

    }
}
