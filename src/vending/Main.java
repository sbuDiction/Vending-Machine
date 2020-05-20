package vending;

import vending.product.*;

public class Main {

    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Product product = new Product();
        SoftDrinks softDrink = new SoftDrinks();
        Chocolates chocolate = new Chocolates();
        SaltySnacks saltySnack = new SaltySnacks();

        System.out.println("20 Soft drinks added to stock ✔\n5 Salty snacks added to stock ✔\n10 Chocolates added to stock ✔\n_______ ______________________");
        System.out.println("       #VENDING MACHINE\n_______ ______________________");
        System.out.println("|* We have " + overloadedVendingMachine.getStock(saltySnack) + " Salty snacks inStock!\n|" + "* We have " + overloadedVendingMachine.getStock(chocolate) + " Chocolates intStock!\n|" + "* We have " + overloadedVendingMachine.getStock(softDrink) + " Soft drinks inStock!");
        System.out.println("--------- " +  "Total stock: " + overloadedVendingMachine.getStock() + " ---------");

        overloadedVendingMachine.promptEnterKey();
        overloadedVendingMachine.buy(product);
        System.out.println("You just bought 1 of everything inStock!\nPurchased ✔");
        overloadedVendingMachine.promptEnterKey();
        overloadedVendingMachine.addStock(5,7,4);
        System.out.println("Stock has been updated ✔\n5 Soft drinks added ✔\n7 Chocolates added ✔\n4 Salty snacks added ✔\n       Total stock: " + overloadedVendingMachine.getStock() + "\nGoodbye...");
    }
}