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

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.saltySnack.setStockLevel(saltySnacksQty);
        this.chocolate.setStockLevel(chocolatesQty);
        this.softDrink.setStockLevel(softDrinkQty);
    }

    void buy(SoftDrinks softdrink) {
        System.out.println(softdrink);
    }

    void buy(SaltySnacks saltySnack) {
        System.out.println(saltySnack);
    }

    void buy(Chocolates chocolate) {
        System.out.println(chocolate);
    }
    void buy(Product product) {
        System.out.println(product);
    }
}
