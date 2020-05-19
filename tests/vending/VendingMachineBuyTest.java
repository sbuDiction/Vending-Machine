package vending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineBuyTest {
    @Test
    public void shouldBuySaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        overloadedVendingMachine.buy(overloadedVendingMachine.saltySnack);
        overloadedVendingMachine.buy(overloadedVendingMachine.saltySnack);
        assertEquals(3,overloadedVendingMachine.saltySnack.getStockLevel(),"Should be able to buy 2 salty snacks from a stock of 5");
    }

    @Test
    public void shouldBuyChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5,15,10);
        overloadedVendingMachine.buy(overloadedVendingMachine.chocolate);
        overloadedVendingMachine.buy(overloadedVendingMachine.chocolate);
        overloadedVendingMachine.buy(overloadedVendingMachine.chocolate);
        overloadedVendingMachine.buy(overloadedVendingMachine.chocolate);
        assertEquals(6,overloadedVendingMachine.chocolate.getStockLevel(),"Should be able to buy 4 Chocolate snacks from a stock of 10");
    }

    @Test
    public void shouldBuySoftDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        overloadedVendingMachine.buy(overloadedVendingMachine.softDrink);
        overloadedVendingMachine.buy(overloadedVendingMachine.softDrink);
        overloadedVendingMachine.buy(overloadedVendingMachine.softDrink);
        overloadedVendingMachine.buy(overloadedVendingMachine.softDrink);
        overloadedVendingMachine.buy(overloadedVendingMachine.softDrink);
        assertEquals(15,overloadedVendingMachine.softDrink.getStockLevel(),"Should be able to buy 5 soft drinks from a stock of 20");
    }

//    @Test
//    public void shouldBuyAllSnacks() {
//        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
//        overloadedVendingMachine.buy(overloadedVendingMachine.saltySnack);
//        overloadedVendingMachine.buy(overloadedVendingMachine.saltySnack);
//        assertEquals(3,overloadedVendingMachine.saltySnack.getStockLevel(),"Should be able to buy 2 salty snacks from a stock of 5");
//    }
}
