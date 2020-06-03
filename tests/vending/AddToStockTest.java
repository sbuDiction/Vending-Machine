package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToStockTest {
    @Test
    public void shouldAddStockToSaltySnacks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.addStock(saltySnack);
        assertEquals(6,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldAddStockToSoftDrinks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        SoftDrink softDrinks = new SoftDrink();
        overloadedVendingMachine.addStock(softDrinks);
        assertEquals(21,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldAddStockToChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Chocolate chocolates = new Chocolate();
        overloadedVendingMachine.addStock(chocolates);
        assertEquals(11,overloadedVendingMachine.getStockLevelForChocolate(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldAddStockToOneOfEverything() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        Product product = new Product();
        overloadedVendingMachine.addStock(product);
        assertEquals(38,overloadedVendingMachine.getStock(),"Should be able to return the number of items in stock for Salty snacks");
    }

    @Test
    public void shouldAddToStockOfTheAmountEntered() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        overloadedVendingMachine.addStock(5,5,5);
        assertEquals(50,overloadedVendingMachine.getStock(),"Should be able to return the number of items in stock for Salty snacks");
    }
}
