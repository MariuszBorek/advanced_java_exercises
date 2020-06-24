package org.enumexercises.my_exercise;

public class ProductPage {

    public String productName = "coś";
    public String productPrice;

    ProductPage addToCart() {
        System.out.println("jakiś tekst z addToCart");
        return this;
    }

    ProductPage setAmount(int amount) {
        System.out.println(amount);
        return this;
    }

    ProductPage goToCart() {
        System.out.println("coś");
        return new ProductPage();
    }

}
