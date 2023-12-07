import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                    list - просмотреть списк товаров.
                    w - посмотерть общий вес товаров.
                    has - проверять, существует ли этот товар, по его имени
                    clear - очистить корзину.
                    ----------------------------------------------------
                    Введите команду:""");

        Basket basket2 = new Basket();
        basket2.add("lemon", 50, 33.2, 2);
        basket2.add("apple", 160, 73.8, 1);
        basket2.add("sausage", 560, 400.0, 1);


        while (true) {
            var value = new Scanner(System.in).next();

            switch (value) {
                case "clear" -> basket2.clear();
                case "has" -> System.out.println(basket2.contains(value));
                case "list" -> basket2.print("Basket - 1");
                case "w" -> System.out.println("Общий вес товаров в корзине: " + basket2.getTotalWeight());
            }
        }
    }
}

