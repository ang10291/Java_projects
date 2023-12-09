import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cheese", "RF23434655757");
        product.setPrice(23);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getBarCode());
    }

}
