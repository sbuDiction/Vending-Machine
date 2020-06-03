package vending;

import org.junit.jupiter.api.Test;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTest {

    @Test
    public void extendableVendingMachineTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5,5,5);
        extendableVendingMachine.buy(new SoftDrink());
        assertEquals(extendableVendingMachine.getStockForSoftDrinks(),4);
        assertEquals(extendableVendingMachine.getMsg(),"Please select a product you want.");

    }
}
