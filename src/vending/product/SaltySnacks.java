package vending.product;

public class SaltySnacks extends Product {
    private int stockLevel;

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    };

    public int getStockLevel() {
        System.out.println(stockLevel + " " + "Stock for salty snacks is updated!");
        return stockLevel;
    }

    public String description() {
        System.out.println("This is a a Salty snack");
        return "This is a Salty snack";
    }
}
