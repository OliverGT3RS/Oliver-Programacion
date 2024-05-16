package Reto6;
 // Importing CLI from the edu.trino.cardenas.reto6.ui package to start the application.
import Reto6.ui.CLI;

/**
 * This class is used to call the method that starts the application;
 * it also displays a specific error to the user in case an unexpected value is entered.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchApp(); // Calling the launchApp method from the CLI class to start the application.
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e); // Displaying an unexpected error message to the user.
        }
    }
}
