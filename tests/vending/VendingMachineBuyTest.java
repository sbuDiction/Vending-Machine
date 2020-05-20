package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineBuyTest {
    @Test
    public void shouldBuySaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SaltySnacks saltySnack = new SaltySnacks();
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(saltySnack);
        assertEquals(3,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should be able to buy 2 salty snacks from a stock of 5");
    }

    @Test
    public void shouldBuyChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5,15,10);
        Chocolates chocolate = new Chocolates();
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(chocolate);
        assertEquals(6,overloadedVendingMachine.getStockLevelForChocolate(),"Should be able to buy 4 Chocolate snacks from a stock of 10");
    }

    @Test
    public void shouldBuySoftDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SoftDrinks softDrink = new SoftDrinks();
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        assertEquals(15,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should be able to buy 5 soft drinks from a stock of 20");
    }

    @Test
    public void shouldBuyAllSnacks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Product product = new Product();
        overloadedVendingMachine.buy(product);
        assertEquals(32,overloadedVendingMachine.getStock(),"Should be able to buy 1 of everything in stock");
    }
}
