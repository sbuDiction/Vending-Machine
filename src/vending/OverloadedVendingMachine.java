package vending;
// imports.
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;
// class instance.

public class OverloadedVendingMachine {

    private int softDrinkQty1;
    private int saltySnacksQty1;
    private int chocolatesQty1;

    void buy(SoftDrinks softdrink) {}
    void buy(SaltySnacks saltySnack) {}
    void buy(Chocolates chocolate) {}
    void buy(Product product) {}

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        softDrinkQty1 = softDrinkQty;
        saltySnacksQty1 = saltySnacksQty;
        chocolatesQty1 = chocolatesQty;
    }

}
