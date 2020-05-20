package vending;

import vending.product.*;

public class Main {

    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Product product = new Product();
        SoftDrinks softDrink = new SoftDrinks();
        Chocolates chocolate = new Chocolates();
        SaltySnacks saltySnack = new SaltySnacks();

        System.out.println("Welcome this is what we have in stock...\n_______ ______________________");
        System.out.println("       #VENDING MACHINE\n_______ ______________________");
        System.out.println("|* We have " + overloadedVendingMachine.getStock(saltySnack) + " Salty snacks inStock!\n|" + "* We have " + overloadedVendingMachine.getStock(chocolate) + " Chocolates intStock!\n|" + "* We have " + overloadedVendingMachine.getStock(softDrink) + " Soft drinks inStock!");
        System.out.println("--------- " +  "Total: " + overloadedVendingMachine.getStock() + " ---------");

        overloadedVendingMachine.promptEnterKey();
    }
}
