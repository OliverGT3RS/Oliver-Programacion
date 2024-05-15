package Reto3.MatrixOfNumbers.ui;

import java.util.Scanner;


public class CLI {
    // Method to launch the application
    public static void LaunchApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Matrix Generator App!");

        int rows, columns;

        do {
            // Ask the user for the number of rows and columns
            System.out.println("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.println("Enter the number of columns: ");
            columns = scanner.nextInt();
            if (rows != columns) {
                // Check if the input values for rows and columns are equal
                System.out.println("Please enter equal values for rows and columns.");
                System.out.println("Please enter equal values for rows and columns.\n");
            }
        } while (rows != columns);

        // Generate and display the matrix with the specified dimensions
        generateTable(rows, columns);
    }

    private static void generateTable(int rows, int columns) {
    }
}
