package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToStockTest {
    @Test
    public void shouldAddStockToSaltySnacks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SaltySnacks saltySnack = new SaltySnacks();
        overloadedVendingMachine.addStock(saltySnack);
        assertEquals(6,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldAddStockToSoftDrinks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SoftDrinks softDrinks = new SoftDrinks();
        overloadedVendingMachine.addStock(softDrinks);
        assertEquals(21,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldAddStockToChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Chocolates chocolates = new Chocolates();
        overloadedVendingMachine.addStock(chocolates);
        assertEquals(11,overloadedVendingMachine.getStockLevelForChocolate(),"Should be able to return the number of items in stock for Salty snacks");
    }
}
