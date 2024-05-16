package Reto6.ui;

import Reto6.Data.Category;
import Reto6.Data.CategoryDifferentiator;
import Reto6.Data.Employee;
import Reto6.Process.ReportGenerator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class allows us to start the application and lets the user register employees,
 * and generates a report at the end of the interaction.
 */
public class CLI {

    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees to capture:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Full name: ");
            String fullName = scanner.nextLine();
            System.out.print("Work hours: ");
            int workHours = scanner.nextInt();
            System.out.print("Overtime hours: ");
            int overtimeHours = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Date of birth: ");
            String dateOfBirth = scanner.nextLine();

            System.out.println("Select employee category:");
            System.out.println("1. Sales Employee");
            System.out.println("2. Administrator");
            System.out.println("3. Manager");
            int selectedCategory = scanner.nextInt();
            Category category = switch (selectedCategory) {
                case 1 -> CategoryDifferentiator.getSalesEmployee();
                case 2 -> CategoryDifferentiator.getAdministrator();
                case 3 -> CategoryDifferentiator.getManager();
                default -> {
                    System.out.println("Invalid option, defaulting to Sales Employee category.");
                    yield CategoryDifferentiator.getSalesEmployee();
                }
            };

            Employee employee = new Employee(fullName, workHours,
                    overtimeHours, phoneNumber, dateOfBirth, category);
            employees.add(employee);
        }

        ReportGenerator.generatePayrollReport(employees);
    }
}
