package Reto6.Data;

// This class differentiates between different categories and provides getters.
public class CategoryDifferentiator {

    // Declaration of categories with their assigned values
    private static final Category salesEmployee = new Category("Sales Employee",
            "SE", 100.00, 50.00);
    private static final Category administrator = new Category("Administrator",
            "ADM", 180.00, 100.00);
    private static final Category manager = new Category("Manager",
            "MGR", 250.00, 150.00);

    // Getters for each category
    public static Category getSalesEmployee() {
        return salesEmployee;
    }

    public static Category getAdministrator() {
        return administrator;
    }

    public static Category getManager() {
        return manager;
    }
}
