package Reto6.Data;

// This class declares attributes for a category, generates its constructor, and provides getters.
public class Category {

    // Attributes declaration
    private String categoryName;
    private String categoryKey;
    private double baseSalary;
    private double hourlyOvertimePay;

    // Constructor
    public Category(String categoryName, String categoryKey, double baseSalary, double hourlyOvertimePay) {
        this.categoryName = categoryName;
        this.categoryKey = categoryKey;
        this.baseSalary = baseSalary;
        this.hourlyOvertimePay = hourlyOvertimePay;
    }

    // Getters
    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryKey() {
        return categoryKey;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getHourlyOvertimePay() {
        return hourlyOvertimePay;
    }

    public int getOvertimeRate() {
        return 0;
    }
}
