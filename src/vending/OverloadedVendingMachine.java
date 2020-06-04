package vending;
// imports.
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

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

    public void buy(SoftDrink softDrink) {
        if (softDrinkLevel > 0) {
            softDrinkLevel = softDrinkLevel - 1;
            softDrink.description();
        }
    }

    public void buy(SaltySnack saltySnack) {
        if (saltySnacksLevel > 0) {
            saltySnacksLevel = saltySnacksLevel -1;
            System.out.println();
            saltySnack.description();
        }
    }

    public void buy(Chocolate chocolate) {
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

    public void addStock(SoftDrink softdrink) {
        softDrinkLevel = softDrinkLevel + 1;
    }

    public void addStock(SaltySnack saltySnack) {
        saltySnacksLevel = saltySnacksLevel +1;
    }

    public void addStock(Chocolate chocolate) {
        chocolatesLevel = chocolatesLevel + 1;
    }

    public void addStock(Product product) {
        saltySnacksLevel = saltySnacksLevel +1;
        chocolatesLevel = chocolatesLevel +1;
        softDrinkLevel = softDrinkLevel +1;
    }

    public int getStock(SoftDrink softdrink) {
        return softDrinkLevel;
    }

    public int getStock(SaltySnack saltySnack) {
        return saltySnacksLevel;
    }

    public int getStock(Chocolate chocolate) {
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
}
