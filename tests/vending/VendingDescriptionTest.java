package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingDescriptionTest {
    @Test
    public void shouldShowTypeOfSnackChocolate() {
        Chocolates chocolate = new Chocolates();
        assertEquals("This is a Chocolate",chocolate.description(),"Should get the description for chocolate");
    }
    @Test
    public void shouldShowTypeOfSnackSoftDrinks() {
        SoftDrinks softDrink = new SoftDrinks();
        assertEquals("This is a soft drink",softDrink.description(),"Should get the description for soft drinks");
    }
    @Test
    public void shouldShowTypeOfSnackSaltySnacks() {
        SaltySnacks saltySnack = new SaltySnacks();
        assertEquals("This is a Salty snack",saltySnack.description(),"Should get the description for salty snacks");
    }

}
