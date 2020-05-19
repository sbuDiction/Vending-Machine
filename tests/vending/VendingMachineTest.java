package vending;

import org.junit.jupiter.api.Test;
import vending.product.SoftDrinks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    @Test
    public void shouldGetStockForSaltySnacks() {
        SoftDrinks softDrink = new SoftDrinks();
        int stockLevel = 20;
        softDrink.setStockLevel(stockLevel);
        assertEquals(20,softDrink.getStockLevel(),"Should return the number for the new updated stock");
    }


}
