package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetStockLevel {

    @Test
    public void shouldShowStockForSaltySnacks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.getStock(saltySnack);
        assertEquals(5,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldShowStockForChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.getStock(chocolate);
        assertEquals(10,overloadedVendingMachine.getStockLevelForChocolate(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldShowStockForSoftDrinks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.getStock(softDrink);
        assertEquals(20,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldShowStockForAllStock() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        assertEquals(35,overloadedVendingMachine.getStock(),"Should be able to return the number of items in stock for Salty snacks");
    }
}
