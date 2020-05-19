package vending;
// imports.
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;
// class instance.

public class OverloadedVendingMachine {

    SoftDrinks softDrink = new SoftDrinks();
    SaltySnacks saltySnack = new SaltySnacks();
    Chocolates chocolate = new Chocolates();

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.saltySnack.addStock(saltySnacksQty);
        this.chocolate.addStock(chocolatesQty);
        this.softDrink.addStock(softDrinkQty);
    }

}
