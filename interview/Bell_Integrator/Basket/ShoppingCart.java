package Basket;

import java.util.*;

public class ShoppingCart implements Basket{
    private Map<String, Integer> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }
    @Override
    public void addProduct(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        products.put(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 5);
        cart.addProduct("Banana", 3);
        cart.addProduct("Apple", 2); // Увеличение количества существующего продукта
        System.out.println("Products in cart: " + cart.getProducts());
        System.out.println("Quantity of Apples: " + cart.getProductQuantity("Apple"));
        System.out.println("Quantity of Oranges: " + cart.getProductQuantity("Orange")); // продукт не в корзине
        cart.removeProduct("Banana");
        System.out.println("Products in cart after removing Banana: " + cart.getProducts());
        cart.updateProductQuantity("Apple", 10);
        System.out.println("Updated quantity of Apples: " + cart.getProductQuantity("Apple"));
        cart.clear();
        System.out.println("Products in cart after clearing: " + cart.getProducts());
    }
}
