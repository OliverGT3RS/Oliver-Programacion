package Evidencia1.Process;

import Evidencia1.Data.Medication;


import java.util.ArrayList;
import java.util.Date;

/**
 * This class manages medication operations like adding medications to a list and generating reports.
 */
public class MedicationManager {

    /**
     * Adds a medication to the list and calculates the sale price based on its pharmaceutical form.
     */
    public static void addMedication(ArrayList<Medication> medicationList, String chemicalName,
                                     String genericName, String registeredName,
                                     double publicPrice, String pharmaceuticalForm){
        // Calculates sale price based on pharmaceutical form
        double salePrice = calculateSalePrice(publicPrice, pharmaceuticalForm);
        Medication medication = new Medication(chemicalName, genericName, registeredName,
                publicPrice, salePrice, pharmaceuticalForm);
        medicationList.add(medication);
    }

    /**
     * Generates a report of registered medications.
     */
    public static void generateReport(String name, ArrayList<Medication> medicationList){
        Date date = new Date();
        int numberOfMedications = medicationList.size();

        System.out.println("Registration made by: " + name);
        System.out.println("Report date: " + date);
        System.out.println("Number of medications in the list: " + numberOfMedications);
        System.out.println("--------------Medications--------------");

        for (Medication medication : medicationList) {
            System.out.println(medication.toString());
        }
    }

    /**
     * Calculates the sale price based on the pharmaceutical form.
     */
    private static double calculateSalePrice(double publicPrice, String pharmaceuticalForm) {
        switch (pharmaceuticalForm) {
            case "solid":
                return publicPrice * 1.09;
            case "semisolid":
                return publicPrice * 1.12;
            case "liquid":
                return publicPrice * 1.13;
            default:
                return publicPrice; // If form is not recognized, use public price
        }
    }
}
