
import java.util.Scanner;

public class areaofCircle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle:");
    int radius = sc.nextInt();
    double area = Math.PI * radius * radius;
    System.out.println(area);
}
}