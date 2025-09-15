public class demofile {
    int salary;
    public demofile(int salary){
    this.salary = salary;
    }
    public static void main(String[] args) {
    int salary = 500000;
    System.out.println(salary);
    demofile d1 = new demofile(40000);
    System.out.println(d1.salary);
}
}
    
