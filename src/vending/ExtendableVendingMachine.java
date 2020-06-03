package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine {
    private int SoftDrinks;
    private int SaltySnacks;
    private int Chocolates;
    private String msg;

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
        else if (product instanceof Product) {
             msg = "Please select a product you want.";
        }
    }

    public void addStock(Product product) {}

    public int getStockForSoftDrinks() {
        System.out.println(this.SoftDrinks);
        return this.SoftDrinks;
    }

    public String getMsg() {
        return msg;
    }
}
