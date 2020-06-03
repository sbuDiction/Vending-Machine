package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTest {

    @Test
    public void buyMethodTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5,5,5);
        extendableVendingMachine.buy(new SoftDrink());
        extendableVendingMachine.buy(new Product());
        assertEquals(extendableVendingMachine.getStockForSoftDrinks(),4);
        assertEquals(extendableVendingMachine.getMsg(),"Please select a product you want.");

    }

    @Test
    public void addToStockTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5,5,5);
        extendableVendingMachine.addStock(new Chocolate());
        assertEquals(extendableVendingMachine.getStockForSoftDrinks(),4);
        assertEquals(extendableVendingMachine.getMsg(),"Please select a product you want.");

    }
}
