package Reto5.Reto5_3.Data;

/**
 * This class represents a product with a name, price, quantity, and total amount.
 */
public class Product {

    public String name;
    public double price;
    public int quantity;
    public double totalAmount;

    /**
     * Constructor to initialize the Product object with a name, price, quantity, and total amount.
     */
    public Product(String name, double price, int quantity, double totalAmount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }
}
