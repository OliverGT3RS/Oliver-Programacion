package Evidencia1;

import Evidencia1.Data.Medication;
import Evidencia1.ui.UserInterface;

import java.util.ArrayList;

import static Evidencia1.ui.UserInterface.launchApp;

/**
 * This class serves as the entry point for the application.
 * It calls the method to start the application, handles unexpected input errors,
 * and declares the ArrayList that will store the medications.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Medication> medicationList = new ArrayList<>();
        try {
            launchApp(medicationList);
        } catch (Exception e ){
            System.out.println("Unexpected error: " + e);
        }
    }
}
