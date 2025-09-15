public class p2 {
     class Circle {
    double radius;
    Circle(){
        this(1.0); 
        Circle(double r) {
        this.radius = r;
    }
    public static void main(String[] args) {
        p2 outer = new p2();
        Circle c1 = outer.new Circle();      
        Circle c2 = outer.new Circle(5.5);
    }
}
}
