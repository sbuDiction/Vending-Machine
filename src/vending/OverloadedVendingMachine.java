package vending;
// imports.
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import java.util.Scanner;
// class instance.

public class OverloadedVendingMachine {

//    stock level for each product
    private int softDrinkLevel;
    private int saltySnacksLevel;
    private int chocolatesLevel;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
         softDrinkLevel = softDrinkQty ;
         saltySnacksLevel = saltySnacksQty;
         chocolatesLevel = chocolatesQty;
    }

    public void buy(SoftDrinks softDrink) {
        if (softDrinkLevel > 0) {
            softDrinkLevel = softDrinkLevel - 1;
            softDrink.description();
        }
    }

    public void buy(SaltySnacks saltySnack) {
        if (saltySnacksLevel > 0) {
            saltySnacksLevel = saltySnacksLevel -1;
            System.out.println();
            saltySnack.description();
        }
    }

    public void buy(Chocolates chocolate) {
        if (chocolatesLevel > 0) {
            chocolatesLevel = chocolatesLevel - 1;
            chocolate.description();
        }
    }

    public int getStockLevelForSoftDrinks() {
        return softDrinkLevel;
    }

    public int getStockLevelForSaltySnacks() {
        return saltySnacksLevel;
    }

    public int getStockLevelForChocolate() {
        return chocolatesLevel;
    }

    public void buy(Product product) {
        softDrinkLevel = softDrinkLevel -1;
        saltySnacksLevel = saltySnacksLevel -1;
        chocolatesLevel = chocolatesLevel -1;
    }

    public void addStock(SoftDrinks softdrink) {
        softDrinkLevel = softDrinkLevel + 1;
    }

    public void addStock(SaltySnacks saltySnack) {
        saltySnacksLevel = saltySnacksLevel +1;
    }

    public void addStock(Chocolates chocolate) {
        chocolatesLevel = chocolatesLevel + 1;
    }

    public void addStock(Product product) {
        saltySnacksLevel = saltySnacksLevel +1;
        chocolatesLevel = chocolatesLevel +1;
        softDrinkLevel = softDrinkLevel +1;
    }

    public int getStock(SoftDrinks softdrink) {
        return softDrinkLevel;
    }

    public int getStock(SaltySnacks saltySnack) {
        return saltySnacksLevel;
    }

    public int getStock(Chocolates chocolate) {
        return chocolatesLevel;
    }

    public int getStock() {
        return softDrinkLevel + saltySnacksLevel + chocolatesLevel;
    }

    public void buy(int softDrinksItems , int chocolatesItems , int saltySnacksItems) {
        softDrinkLevel = softDrinkLevel - softDrinksItems;
        chocolatesLevel = chocolatesLevel - chocolatesItems;
        saltySnacksLevel = saltySnacksLevel - saltySnacksItems;
    }

    public void addStock(int softDrinkQty, int chocolateQty, int saltySnacksQty) {
        softDrinkLevel = softDrinkLevel + softDrinkQty;
        chocolatesLevel = chocolatesLevel + chocolateQty;
        saltySnacksLevel = saltySnacksLevel + saltySnacksQty;
    }

    public void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void promptInput() {
        String test = "";
        Scanner myScanner = new Scanner(System.in);
        test = myScanner.next();
        System.out.print(test);
    }
}
