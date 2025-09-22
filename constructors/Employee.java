class Employee {
    public int employeeID;      
    protected String department; 
    private double salary;      
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }
    public double getSalary() {
        return salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }
    void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);       
        System.out.println("Department: " + department); 
        System.out.println("Salary via getter: $" + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}