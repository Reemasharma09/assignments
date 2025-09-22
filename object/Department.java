import java.util.ArrayList;
class Employee {
    String name;
    String role;
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}
class Department {
    String deptName;
    ArrayList<Employee> employees;
    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }
    void addEmployee(Employee e) {
        employees.add(e);
    }
    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployeeInfo();
        }
    }
}
class Company {
    String companyName;
    ArrayList<Department> departments;
    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }
    void addDepartment(Department d) {
        departments.add(d);
    }
    void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
        System.out.println("------------------------");
    }
}
