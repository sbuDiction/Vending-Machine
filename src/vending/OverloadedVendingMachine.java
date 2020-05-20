package vending;
// imports.
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;
// class instance.

public class OverloadedVendingMachine {

//    stock level for each product
    private int softDrinkLevel;
    private int saltySnacksLevel;
    private int chocolatesLevel;

    Product product = new Product();
    SoftDrinks softDrink = new SoftDrinks();
    SaltySnacks saltySnack = new SaltySnacks();
    Chocolates chocolate = new Chocolates();

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

    public void buy(Product product) {}

    public void addStock(SoftDrinks softdrink) {
        softDrinkLevel = softDrinkLevel + 1;
        softdrink.description();
    }

    public void addStock(SaltySnacks saltySnack) {
        saltySnacksLevel = saltySnacksLevel +1;
        saltySnack.description();
    }

    public void addStock(Chocolates chocolate) {
        chocolatesLevel = chocolatesLevel + 1;
        chocolate.description();
    }

    public void addStock(Product product) {}

    public int getStock(SoftDrinks softdrink) {
        int stock = softDrinkLevel;
        softdrink.description();
        return stock;
    }

    public int getStock(SaltySnacks saltySnack) {
        int stock = saltySnacksLevel;
        saltySnack.description();
        return stock;
    }

    public int getStock(Chocolates chocolate) {
        int stock = chocolatesLevel;
        chocolate.description();
        return stock;
    }

    public int getStock() {
        return softDrinkLevel + saltySnacksLevel + chocolatesLevel;
    }


}
