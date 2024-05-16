package Reto5.Reto5_4.Data;

/**
 * This class represents a contact with a name, address, home phone number, and work phone number.
 */
public class Contact {

    public String name;
    public String address;
    public int homePhone;
    public int workPhone;

    /**
     * Constructor to initialize the Contact object with a name, address, home phone number, and work phone number.
     */
    public Contact(String name, String address, int homePhone, int workPhone) {
        this.name = name;
        this.address = address;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }
}
