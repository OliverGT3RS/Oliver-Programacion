package Evidencia1.ui;

import Evidencia1.Data.Medication;
import Evidencia1.Process.MedicationManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class handles user interaction for medication registration and reporting.
 */
public class UserInterface {

    /**
     * Launches the application, prompting the user to log in and then allowing them
     * to register medications until they choose to exit and view a report of registered medications.
     */
    public static void launchApp(ArrayList<Medication> medicationList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, please log in.");

        // Correct username and password
        String correctUsername = "User";
        String correctPassword = "Password";

        boolean credentialsCorrect = false;

        // Loop to prompt the user for username and password until correct credentials are entered
        String username = null;
        while (!credentialsCorrect) {
            System.out.println("Enter your username: ");
            username = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                credentialsCorrect = true;
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        System.out.println("Welcome " + username);
        System.out.println("\n------------------------Registration------------------------");

        // Loop to allow user to register medications until they choose to exit
        while (true) {
            System.out.println("Enter the details of the medication you want to register." +
                    "\n(Type 'exit' to exit the program).");
            // Input medication details
            // ...
            // Add registered medication to the ArrayList
            // MedicationManager.addMedication(medicationList, name, ...);

            boolean exitCondition = false;
            if (exitCondition) {
                break;
            }
        }

        // Print the report of registered medications
        MedicationManager.generateReport(username, medicationList);
    }
}
