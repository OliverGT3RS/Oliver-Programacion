package Reto5.Reto5_5.Data;

/**
 * This class represents an item with a name, price, VAT, net amount, and quantity.
 */
public class  Item {

    public String name;
    public double price;
    public double vat;
    public double netAmount;
    public int quantity;

    /**
     * Constructor to initialize the Item object with a name, price, VAT, net amount, and quantity.
     */
    public Item(String name, double price, double vat, double netAmount, int quantity) {
        this.name = name;
        this.price = price;
        this.vat = vat;
        this.netAmount = netAmount;
        this.quantity = quantity;
    }
}
