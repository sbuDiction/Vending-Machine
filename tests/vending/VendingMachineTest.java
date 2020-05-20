package vending;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    @Test
    public void shouldGetStockForSaltySnacks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20,5,10);
        assertEquals(5,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should return the number for the new updated stock");
    }
}
