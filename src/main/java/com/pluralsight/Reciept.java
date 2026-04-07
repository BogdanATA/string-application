package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {

        String itemName = "apples";
        double itemPrice = 2.31;

        int quantity = 3;

        double total = itemPrice * quantity;

        System.out.println("You bought" + " " + quantity + " " + itemName + " " + "for $" + total);
    }
}
