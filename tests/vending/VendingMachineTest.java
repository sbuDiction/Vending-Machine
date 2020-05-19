package vending;

import vending.product.Chocolates;
import vending.product.Product;

import org.junit.jupiter.api.Test;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    @Test
    public void shouldShowTypeOfSnackChocolate() {
        Chocolates chocolate = new Chocolates();
        assertEquals("This is a Chocolate",chocolate.description());
    }

    @Test
        public void shouldShowTypeOfSnackSoftDrinks() {
            SoftDrinks softDrink = new SoftDrinks();
            assertEquals("This is a soft drink",softDrink.description());
    }

    @Test
        public void shouldShowTypeOfSnackSaltySnacks() {
        SaltySnacks saltySnack = new SaltySnacks();
        assertEquals("This is a Salty snack",saltySnack.description());
    }

}
