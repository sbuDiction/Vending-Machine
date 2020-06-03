package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingDescriptionTest {
    @Test
    public void shouldShowTypeOfSnackChocolate() {
        Chocolate chocolate = new Chocolate();
        assertEquals("This is a Chocolate",chocolate.description(),"Should get the description for chocolate");
    }
    @Test
    public void shouldShowTypeOfSnackSoftDrinks() {
        SoftDrink softDrink = new SoftDrink();
        assertEquals("This is a soft drink",softDrink.description(),"Should get the description for soft drinks");
    }
    @Test
    public void shouldShowTypeOfSnackSaltySnacks() {
        SaltySnack saltySnack = new SaltySnack();
        assertEquals("This is a Salty snack",saltySnack.description(),"Should get the description for salty snacks");
    }

}
