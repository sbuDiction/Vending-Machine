package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTest {

    @Test
    public void buyMethodTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5,5,5);
        extendableVendingMachine.buy(new SoftDrink());
        extendableVendingMachine.buy(new SoftDrink());
        extendableVendingMachine.buy(new SoftDrink());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new SaltySnack());
        extendableVendingMachine.buy(new SaltySnack());
        extendableVendingMachine.buy(new SaltySnack());

        assertEquals(extendableVendingMachine.getSoftDrinks(),2);
        assertEquals(extendableVendingMachine.getChocolates(),3);
        assertEquals(extendableVendingMachine.getSaltySnacks(),2);

    }

    @Test
    public void addToStockTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(5,5,5);
        extendableVendingMachine.addStock(new Chocolate());
        extendableVendingMachine.addStock(new Chocolate());
        extendableVendingMachine.addStock(new SaltySnack());
        extendableVendingMachine.addStock(new SoftDrink());
        extendableVendingMachine.addStock(new SoftDrink());
        extendableVendingMachine.addStock(new SoftDrink());

        assertEquals(extendableVendingMachine.getChocolates(),11);
        assertEquals(extendableVendingMachine.getSoftDrinks(),14);
        assertEquals(extendableVendingMachine.getSaltySnacks(),8);

    }

    @Test
    public void getStockTypeChocolateTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,15,5);
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.addStock(new Chocolate());
        extendableVendingMachine.addStock(new Chocolate());

        assertEquals(extendableVendingMachine.getStock(new Chocolate()),9);

    }

    @Test
    public void getStockTypeSaltySnacksTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,15,5);
        extendableVendingMachine.buy(new SaltySnack());
        extendableVendingMachine.buy(new SaltySnack());
        extendableVendingMachine.addStock(new SaltySnack());
        extendableVendingMachine.addStock(new SaltySnack());

        assertEquals(extendableVendingMachine.getStock(new SaltySnack()),19);

    }

    @Test
    public void getStockTypeSoftDrinksTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,15,5);
        extendableVendingMachine.buy(new SoftDrink());
        extendableVendingMachine.buy(new SoftDrink());
        extendableVendingMachine.addStock(new SoftDrink());
        extendableVendingMachine.addStock(new SoftDrink());

        assertEquals(extendableVendingMachine.getStock(new SoftDrink()),14);

    }

    @Test
    public void buyHowManyTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,15,5);
        extendableVendingMachine.buy(new Chocolate(),2);

        assertEquals(extendableVendingMachine.getStock(new Chocolate()),3);

    }

    @Test
    public void shouldSpecifyHowManyToAddToStock() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,15,5);
        extendableVendingMachine.addStock(new Chocolate(),10);

        assertEquals(extendableVendingMachine.getStock(new Chocolate()),15);

    }

}
