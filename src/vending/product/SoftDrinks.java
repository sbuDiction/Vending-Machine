package vending.product;

public class SoftDrinks extends Product {
    private int stockLevel;

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    };

    public int getStockLevel() {
        System.out.println(stockLevel + " " + "Stock for soft drink is updated!");
        return stockLevel;
    }

    public String description() {
        System.out.println("This is a soft drink");
        return "This is a soft drink";
    }
}
