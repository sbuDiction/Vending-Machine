package vending.product;

public class Chocolates extends Product {
    private int stockLevel;

    public void addStock(int stockLevel) {
        this.stockLevel = stockLevel;
    };

    public int getStockLevel() {
        System.out.println(stockLevel + " " + "Stock for chocolate is updated!");
        return stockLevel;
    }

    public String description() {
        System.out.println("This is a Chocolate");
        return "This is a Chocolate";
    }
}
