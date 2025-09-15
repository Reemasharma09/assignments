
public class Car {
    public static int numberOfCars=0;    
    String model;
    int year;
    public Car(String model,int year){
        this.model=model;
        this.year=year;
        
    }
        public static void main(String[] args) {
            Car car1=new Car("honda",2022);
            Car car2=new Car("maruti",2025);
            System.out.println(car1.year+car1.model);
            System.out.println(car2.year+car2.model);
 }
}