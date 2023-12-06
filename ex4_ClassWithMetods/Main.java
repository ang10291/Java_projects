public class Main {

    public static void main(String[] args) {
        Order basket = new Order();
        basket.addProducts(2, 255);
        basket.addProducts(6, 345);

        System.out.println("Продукты в корзине: \nКоличество: " + basket.getCount());
        System.out.println("Стоимость: " + basket.getTotalCost());

    }

}

