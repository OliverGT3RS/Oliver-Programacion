package Reto6.Process;

  // Importing Employee class to use its data.
import Reto6.Data.Employee;

import java.util.ArrayList; // Importing ArrayList from Java to use it.

/**
 * This class defines the method to generate the payroll report.
 */
public class ReportGenerator {

    /**
     * This method performs operations based on user input and generates the payroll report.
     * @param employees An ArrayList of Employee objects containing employee data.
     */
    public static void generatePayrollReport(ArrayList<Employee> employees) {

        // Declaring variables used within the method.
        double totalPayroll = 0;
        double totalRegularSalary = 0;
        double totalOvertimePay = 0;
        int totalWorkHours = 0;
        int totalEmployeesWithOvertime = 0;
        int totalEmployeesWithoutOvertime = 0;

        // Performing operations for each registered employee.
        for (Employee employee : employees) {
            double regularSalary = employee.getWorkHours() * employee.getCategory().getBaseSalary();
            double overtimePay = employee.getOvertimeHours() * employee.getCategory().getOvertimeRate();

            totalPayroll += regularSalary + overtimePay;
            totalRegularSalary += regularSalary;
            totalOvertimePay += overtimePay;
            totalWorkHours += employee.getWorkHours() + employee.getOvertimeHours();

            if (employee.getOvertimeHours() > 0) {
                totalEmployeesWithOvertime++;
            } else {
                totalEmployeesWithoutOvertime++;
            }
        }

        // Generating the payroll report format.
        System.out.println("\nPayroll Report");
        System.out.println("Total company payroll: $" + totalPayroll);
        System.out.println("Total regular salary payout: $" + totalRegularSalary);
        System.out.println("Total overtime pay: $" + totalOvertimePay);
        System.out.println("Total work hours in the company: " + totalWorkHours + " hours");
        System.out.println("Total employees with overtime: " + totalEmployeesWithOvertime);
        System.out.println("Total employees without overtime: " + totalEmployeesWithoutOvertime);
    }
}
