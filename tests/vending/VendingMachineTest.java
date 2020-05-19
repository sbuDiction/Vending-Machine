package vending;

import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;
import vending.product.Product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    @Test
    public void shouldShowDescriptionType() {
        Chocolates chocolate = new Chocolates();
        SoftDrinks softDrink = new SoftDrinks();
        SaltySnacks saltySnack = new SaltySnacks();
        assertEquals("This is a soft drink",softDrink.description());
        assertEquals("This is a Salty snack",saltySnack.description());
        assertEquals("This is a Chocolate",chocolate.description());
    }

}
