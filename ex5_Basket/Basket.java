public class Basket {
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0.0;
    public Basket() {
        increaseCount();
        items = "Список товаров:";
        this.limit = 1000000;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public void increaseCount() {
        Basket.count = Basket.count + count; //количество товаров в баскете
    }
    public void add(String name, int price) {
        add(name, price, 1, 1.0);
    }
    public void add(String name, int price, int count, double weight) {
        add(name, price, 1, weight);
    }
    public void add(String name, int price, double weight, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        double resultWeight = (count >= 2) ? (weight * count) : weight;
        items = items + "\n" + name + " - " +
                count + " шт., " + resultWeight + " вес - " + price + " руб.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight * count;

    }
    //проверять, существует ли этот товар по его имени
    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }
    public void clear() {
        System.out.println("Корзина очищена!");
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
//    public static int getCount() {
//        return count;
//    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
