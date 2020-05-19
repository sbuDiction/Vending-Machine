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
    @Test
    public void shouldSetStockForChocolate() {
        Chocolates chocolates = new Chocolates();
        int stockLevel = 10;
        chocolates.setStockLevel(stockLevel);
        assertEquals(10,chocolates.getStockLevel(),"Should be abe to set the stock or update the stock for Chocolate");
    }
    @Test
    public void shouldSetStockForSaltySnacks() {
        SaltySnacks saltySnack = new SaltySnacks();
        int stockLevel = 5;
        saltySnack.setStockLevel(stockLevel);
        assertEquals(5,saltySnack.getStockLevel(),"Should be abe to set the stock or update the stock for Salty snacks");
    }
    @Test
    public void shouldSetStockForSoftDrinks() {
        SoftDrinks softDrink = new SoftDrinks();
        int stockLevel = 20;
        softDrink.setStockLevel(stockLevel);
        assertEquals(20,softDrink.getStockLevel(),"Should be abe to set the stock or update the stock for Soft drink");
    }
    @Test
    public void shouldGetStockForSaltySnacks() {
        SoftDrinks softDrink = new SoftDrinks();
        int stockLevel = 20;
        softDrink.setStockLevel(stockLevel);
        assertEquals(20,softDrink.getStockLevel(),"Should return the number for the new updated stock");
    }
}
