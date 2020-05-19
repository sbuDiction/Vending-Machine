package vending;
// imports.
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;
// class instance.

public class OverloadedVendingMachine {

    Product product = new Product();
    SoftDrinks softDrink = new SoftDrinks();
    SaltySnacks saltySnack = new SaltySnacks();
    Chocolates chocolate = new Chocolates();

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.saltySnack.setStockLevel(saltySnacksQty);
        this.chocolate.setStockLevel(chocolatesQty);
        this.softDrink.setStockLevel(softDrinkQty);
    }

    public void buy(SoftDrinks softDrink) {
        if (softDrink.getStockLevel() > 0) {
            softDrink.setStockLevel(softDrink.getStockLevel() - 1);
            System.out.println(softDrink.getStockLevel() + " " + "Bought salty snack");
        }
    }

    public void buy(SaltySnacks saltySnack) {
        if (saltySnack.getStockLevel() > 0) {
            saltySnack.setStockLevel(saltySnack.getStockLevel() - 1);
            System.out.println(saltySnack.getStockLevel() + " " + "Bought salty snack");
        }
    }

    public void buy(Chocolates chocolate) {
        if (chocolate.getStockLevel() > 0) {
            chocolate.setStockLevel(chocolate.getStockLevel() - 1);
            System.out.println(chocolate.getStockLevel() + " " + "Bought salty snack");
        }
    }

    public void buy(Product product) {}

    public void addStock(SoftDrinks softdrink) {
        softdrink.setStockLevel(softdrink.getStockLevel() + 1);
    }

    public void addStock(SaltySnacks saltySnack) {
        saltySnack.setStockLevel(saltySnack.getStockLevel() + 1);
    }

    public void addStock(Chocolates chocolate) {
        chocolate.setStockLevel(chocolate.getStockLevel() + 1);
    }

    public void addStock(Product product) {}

    public int getStock(SoftDrinks softdrink) {
        int stock = softdrink.getStockLevel();
        return stock;
    }

    public int getStock(SaltySnacks saltySnack) {
        int stock = saltySnack.getStockLevel();
        return stock;
    }

    public int getStock(Chocolates chocolate) {
        int stock = chocolate.getStockLevel();
        return stock;
    }

    public int getStock() {
        int total = softDrink.getStockLevel() + saltySnack.getStockLevel() + chocolate.getStockLevel();
        return total;
    }
}
