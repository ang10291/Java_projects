
public class Main {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items

        if (appleCount >= 5) {
            System.out.println("Apple juice");
        } else {
            System.out.println("Not enough ingredients");
        }

        if (powderAmount == 400 && sugarAmount == 10 && milkAmount == 1000 && oilAmount == 30) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Not enough ingredients");
        }

        if (milkAmount == 300 && powderAmount == 5 && eggsCount == 5) {
            System.out.println("Omelette");
        } else {
            System.out.println("Not enough ingredients");
        }

        if (appleCount == 3 && milkAmount == 100 && powderAmount == 300 && eggsCount == 4) {
            System.out.println("Apple pie");
        } else {
            System.out.println("Not enough ingredients");
        }
    }
}