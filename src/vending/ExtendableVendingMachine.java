package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine {
    private int SoftDrinks;
    private int SaltySnacks;
    private int Chocolates;
    private int stockType = 0;

    public ExtendableVendingMachine(int SoftDrinks, int SaltySnacks, int Chocolates) {
        this.SoftDrinks = SoftDrinks;
        this.SaltySnacks = SaltySnacks;
        this.Chocolates = Chocolates;
    }

    public void buy(Product product) {
        if (product instanceof SoftDrink) {
            SoftDrinks = SoftDrinks-1;
        }
        if (product instanceof SaltySnack) {
            SaltySnacks = SaltySnacks-1;
        }
        if (product instanceof Chocolate) {
            Chocolates = Chocolates-1;
        }
    }

    public void addStock(Product product) {
        if (product instanceof SoftDrink) {
            SoftDrinks = SoftDrinks+3;
        }
        if (product instanceof SaltySnack) {
            SaltySnacks = SaltySnacks+3;
        }
        if (product instanceof Chocolate) {
            Chocolates = Chocolates+3;
        }
    }

    public int getSoftDrinks() {
        System.out.println("stock level for SoftDrinks " + SoftDrinks);
        return SoftDrinks;
    }

    public int getChocolates() {
        System.out.println("stock level for Chocolates " + Chocolates);
        return Chocolates;
    }

    public int getSaltySnacks() {
        System.out.println("stock level for SaltySnacks " + SaltySnacks);
        return SaltySnacks;
    }

    public int getStock(Product product) {
        if (product instanceof SoftDrink){
            stockType = stockType + SoftDrinks;
            System.out.println(stockType);
        }
        if (product instanceof SaltySnack) {
            stockType = stockType + SaltySnacks;
        }
        if (product instanceof Chocolate) {
            stockType = stockType + Chocolates;
            System.out.println(stockType);
        }

        return stockType;
    }

    public void buy(Product product, int qty) {
        if (product instanceof Chocolate) {
            Chocolates = Chocolates - qty;
        }
        if (product instanceof SaltySnack) {
            SaltySnacks = SaltySnacks - qty;
        }
        if (product instanceof SoftDrink) {
            SoftDrinks = SoftDrinks - qty;
        }
    }

    public void addStock(Product product, int qty) {
        if (product instanceof Chocolate) {
            Chocolates = Chocolates + qty;
        }
        if (product instanceof SaltySnack) {
            SaltySnacks = SaltySnacks + qty;
        }
        if (product instanceof SoftDrink) {
            SoftDrinks = SoftDrinks + qty;
        }
    }
}
