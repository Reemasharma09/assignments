
import java.util.Scanner;

public class VolumeofaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume =3.14*radius*radius*height;
        System.out.print(volume);
    }
}
