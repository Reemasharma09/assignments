import java.util.Scanner;
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Area of Circle = " + c.getArea());
        System.out.println("Circumference of Circle = " + c.getCircumference());
        sc.close();
    }
}
