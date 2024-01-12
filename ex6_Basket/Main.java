import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Basket basket2 = new Basket();
        basket2.add("lemon", 50, 33.2, 2);
        basket2.add("apple", 160, 73.8, 1);
        basket2.add("sausage", 560, 400.0, 1);

        Basket basket3 = new Basket();
        basket3.add("jggg", 89, 2.9, 2);

        basket3.print("Basket");
        basket2.print("\nBasket2");

        System.out.println("Общее количество корзин: " + Basket.getCount());
        System.out.println("Общая стоимость корзин: " + Basket.getPriceProducts());
        System.out.println("Общее количество товаров: " + Basket.getCountProducts());
        System.out.printf("\nСредняя стоимость корзины: " + "%.2f", Basket.averagePrice());
        System.out.printf("\nСредняя стоимость товаров: " + "%.2f", Basket.averageProductsPrice());
        System.out.println();



        System.out.println("""
                    \nКоманды:
                    введите название корзины, чтобы просмотреть списк товаров. Напр. Lbasket
                    введите w1, чтобы посмотерть общий вес товаров. Напр. w1, где 1 номер корзины
                    введите название корзины, чтобы очистить корзину.
                    введите p1, чтобы посмотреть общую стоимость корзины. Напр. p1, где 1 номер корзины
                    ----------------------------------------------------
                    Введите команду:""");

        while (true) {
            var value = new Scanner(System.in).next();
            if (basket2.contains(value)) {
                System.out.println(basket2.contains(value));
            } else if (basket3.contains(value)) {
                System.out.println(basket3.contains(value));
            } else {
                System.out.println(false);
            }

            switch (value) {
                case "basket2" -> basket2.clear();
                case "basket3" -> basket3.clear();
                case "Lbasket2" -> basket2.print("Basket - 1");
                case "Lbasket3" -> basket2.print("Basket - 2");
                case "w2" -> System.out.println("Общий вес корзины basket2: " + basket2.getTotalWeight());
                case "w3" -> System.out.println("Общий вес корзины basket3: " + basket3.getTotalWeight());
                case "p2" -> System.out.println("Общая стоимость корзины basket2: " + basket2.getTotalPrice());
                case "p3" -> System.out.println("Общая стоимость корзины basket3: " + basket3.getTotalPrice());
            }
        }
    }
}
