package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineSetStockTest {
    @Test
    public void shouldSetStockForChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Chocolates chocolates = new Chocolates();
        overloadedVendingMachine.getStock(chocolates);
        assertEquals(10,overloadedVendingMachine.getStockLevelForChocolate(),"Should be abe to set the stock or update the stock for Chocolate");
    }
    @Test
    public void shouldSetStockForSaltySnacks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SaltySnacks saltySnack = new SaltySnacks();
        overloadedVendingMachine.getStock(saltySnack);
        assertEquals(5,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should be abe to set the stock or update the stock for Salty snacks");
    }
    @Test
    public void shouldSetStockForSoftDrinks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SoftDrinks softDrink = new SoftDrinks();
        overloadedVendingMachine.getStock(softDrink);
        assertEquals(20,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should be abe to set the stock or update the stock for Soft drink");
    }
}
