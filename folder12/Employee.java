package com.bridgelabz.oops.inbuiltfunction;

public class Employee {
    private static String companyName = "Tech Solutions Pvt. Ltd.";

    // Instance variables
    private int empId;
    private String empName;
    private String department;
    private double salary;

    // Constructor
    public Employee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Company   : " + companyName);
        System.out.println("Emp ID    : " + empId);
        System.out.println("Name      : " + empName);
        System.out.println("Department: " + department);
        System.out.println("Salary    : " + salary);
        System.out.println("---------------------------");
    }

    // Static method to change company name (optional)
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create employee objects
        Employee e1 = new Employee(101, "Alice", "HR", 50000);
        Employee e2 = new Employee(102, "Bob", "IT", 60000);
        Employee e3 = new Employee(103, "Charlie", "Finance", 55000);

        // Display employee details
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        // Change company name (affects all employees)
        Employee.setCompanyName("NextGen Tech Pvt. Ltd.");
        System.out.println("After Changing Company Name:");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();
    }
}