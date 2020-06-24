package org.enumexercises.my_exercise;

public class App {
    public static void main(String[] args) {
        ProductPage productPage = new ProductPage();
        productPage.addToCart().setAmount(23).goToCart();

    }
}
