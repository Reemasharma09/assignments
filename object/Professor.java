import java.util.ArrayList;
class Professor {
    String name;
    String department;
    Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }
    void assignCourse(Course c) {
        c.professor = this;
        System.out.println("Professor " + name + " assigned to " + c.courseName);
    }
}
class Course {
    String courseName;
    Professor professor;
    Course(String courseName) {
        this.courseName = courseName;
    }
    void displayCourse() {
        System.out.print("Course: " + courseName);
        if (professor != null) {
            System.out.println(", Professor: " + professor.name);
        } else {
            System.out.println(", Professor: Not assigned");
        }
    }
}
class Student {
    String name;
    ArrayList<Course> enrolledCourses;
    Student(String name) {
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }
    void enrollCourse(Course c) {
        enrolledCourses.add(c);
        System.out.println(name + " enrolled in " + c.courseName);
    }
    void displayCourses() {
        System.out.println("Courses for Student: " + name);
        for (Course c : enrolledCourses) {
            c.displayCourse();
        }
    }
}
