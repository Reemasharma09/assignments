class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}
public class StudentReportDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 101, 92);
        Student s2 = new Student("Reema", 102, 68);
        Student s3 = new Student("Rahul", 103, 35);
        System.out.println("Student 1 Report:");
        s1.displayDetails();

        System.out.println("\nStudent 2 Report:");
        s2.displayDetails();

        System.out.println("\nStudent 3 Report:");
        s3.displayDetails();
    }
}