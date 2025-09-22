class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("-----------------------------");
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("-----------------------------");
    }
}
class Intern extends Employee {
    String university;
    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
        System.out.println("-----------------------------");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 90000, 10);
        Employee e2 = new Developer("Bob", 102, 70000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "XYZ University");
        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            e.displayDetails(); 
        }
    }
}
