package Reto6.Data;

// This class declares the attributes of an employee, creates its constructor, and provides getters.
public class Employee {

    // Attributes declaration
    private String fullName;
    private int hoursWorked;
    private int overtimeHoursWorked;
    private String phoneNumber;
    private String dateOfBirth;
    private Category category;

    // Constructor
    public Employee(String fullName, int hoursWorked, int overtimeHoursWorked,
                    String phoneNumber, String dateOfBirth, Category category) {
        this.fullName = fullName;
        this.hoursWorked = hoursWorked;
        this.overtimeHoursWorked = overtimeHoursWorked;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.category = category;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Category getCategory() {
        return category;
    }

    public int getWorkHours() {
        return 0;
    }

    public int getOvertimeHours() {
        return 0;
    }
}
