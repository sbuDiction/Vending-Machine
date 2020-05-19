package vending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToStockTest {

    @Test
    public void shouldBuySaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        overloadedVendingMachine.addStock(overloadedVendingMachine.saltySnack);
        assertEquals(6,overloadedVendingMachine.saltySnack.getStockLevel(),"Should be able to add 1 item to the Salty snacks stock");
    }

    @Test
    public void shouldBuyChocolateSnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        overloadedVendingMachine.addStock(overloadedVendingMachine.chocolate);
        assertEquals(11,overloadedVendingMachine.chocolate.getStockLevel(),"Should be able to add 1 item to the Chocolate stock");
    }

    @Test
    public void shouldBuySoftDrinks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        overloadedVendingMachine.addStock(overloadedVendingMachine.softDrink);
        assertEquals(11,overloadedVendingMachine.softDrink.getStockLevel(),"Should be able to add 1 item to the Soft drinks stock");
    }
}