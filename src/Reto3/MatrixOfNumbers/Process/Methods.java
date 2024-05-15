package Reto3.MatrixOfNumbers.Process;

public class Methods {

    private static int[][] table;

    // Method to generate a complete table with random numbers
    public static void generateTable(int rows, int columns){
        table = new int[rows][columns];
        fillTable(rows, columns);
        displayTable(rows, columns);
        countEvenOdd(rows, columns);
    }

    // Method to fill the table with random numbers
    private static void fillTable(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = (int) (Math.random() * 100); // Generate random numbers between 0 and 99
            }
        }
    }

    // Method to display the generated table
    private static void displayTable(int rows, int columns) {
        System.out.println("Generated Table:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to count the number of even and odd numbers in each row and column
    private static void countEvenOdd(int rows, int columns) {
        System.out.println("\n---------------------Rows----------------------");
        for (int i = 0; i < rows; i++) {
            int evenRow = 0, oddRow = 0;
            for (int j = 0; j < columns; j++) {
                if (table[i][j] % 2 == 0) {
                    evenRow++;
                } else {
                    oddRow++;
                }
            }
            System.out.println("Number of even numbers: " + evenRow + ", odd numbers: " +
                    oddRow + " in row " + (i + 1));
        }

        System.out.println("\n--------------------Columns--------------------");
        for (int j = 0; j < columns; j++) {
            int evenColumn = 0, oddColumn = 0;
            for (int i = 0; i < rows; i++) {
                if (table[i][j] % 2 == 0) {
                    evenColumn++;
                } else {
                    oddColumn++;
                }
            }
            System.out.println("Number of even numbers: " + evenColumn + ", odd numbers: " +
                    oddColumn + " in column " + (j + 1));
        }
    }
}
