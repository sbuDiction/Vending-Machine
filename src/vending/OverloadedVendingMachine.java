package vending;

import vending.product.Product;

public class OverloadedVendingMachine {

    void buy(SoftDrink softdrink) {}

    void buy(SaltySnack saltySnack) {}

    void buy(Chocolate chocolate) {}

    void buy(Product product) {}

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {}

}
