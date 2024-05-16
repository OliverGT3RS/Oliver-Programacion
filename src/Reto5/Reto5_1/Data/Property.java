package Reto5.Reto5_1.Data;

/**
 * This class represents a property with an address, coordinates, and status.
 */
public class  Property {

    public String address;
    public double coordinates;
    public String status;

    /**
     * Constructor to initialize the Property object with address, coordinates, and status.
     */
    public Property(String address, double coordinates, String status) {
        this.address = address;
        this.coordinates = coordinates;
        this.status = status;
    }
}
