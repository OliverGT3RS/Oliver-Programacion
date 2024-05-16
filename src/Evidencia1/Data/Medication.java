package Evidencia1.Data;

/**
 * This class initializes the variables: chemical name, generic name,
 * registered name, public price, sale price, and pharmaceutical form;
 * to be used within the Medication constructor. Additionally, in this class we add
 * a toString method, which allows us to print our Medication constructor in an organized manner.
 */
public class Medication {
    public String chemicalName;
    public String genericName;
    public String registeredName;
    public double publicPrice;
    public double salePrice;
    public String pharmaceuticalForm;

    /**
     * Here we declare our Medication constructor, which contains the variables of:
     * chemical name, generic name, registered name, public price,
     * sale price, and pharmaceutical form.
     */
    public Medication(String chemicalName, String genericName,
                      String registeredName, double publicPrice,
                      double salePrice, String pharmaceuticalForm) {
        this.chemicalName = chemicalName;
        this.genericName = genericName;
        this.registeredName = registeredName;
        this.publicPrice = publicPrice;
        this.salePrice = salePrice;
        this.pharmaceuticalForm = pharmaceuticalForm;
    }

    /**
     * Here we use a toString method to print our Medication constructor in an organized manner.
     */
    @Override
    public String toString() {
        return ("Chemical Name: " + chemicalName +
                "\nGeneric Name: " + genericName +
                "\nRegistered Name: " + registeredName +
                "\nPublic Price: " + publicPrice +
                "\nSale Price: " + salePrice +
                "\nPharmaceutical Form: " + pharmaceuticalForm);
    }
}
