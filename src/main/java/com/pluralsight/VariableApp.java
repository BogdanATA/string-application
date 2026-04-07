package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        String favColor;
        int startingYear;
        char middleInitial;
        boolean hasPets;
        String niceMessage;

        final int DAYS_IN_WEEK = 7;
        double coffeePrice = 4.99;
        char favLetter = 'B';
        boolean isRaining = false;

        System.out.println("There are" + " " + DAYS_IN_WEEK + " " + "days in a week");
        System.out.println("The price of coffee is $" + coffeePrice);
        System.out.println("My favorite letter is: " + favLetter);
        System.out.println("It is raining: " + isRaining);
    }
}
