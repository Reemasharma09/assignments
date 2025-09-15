public class Student {
    String name;
    int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public static void main(String[] args) {
         Student student1=new Student("Reema",80);
          Student student2=new Student("charu",85);
            System.out.println(student1.name+student1.marks);
            System.out.println(student2.name+student2.marks);
        
    }  
}
