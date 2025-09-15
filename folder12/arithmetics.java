import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class arithmetics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your date: ");
        String date=sc.nextLine();
        DateTimeFormatter myformat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate finaldate=LocalDate.parse(date,myformat);
        LocalDate finaldate1=finaldate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("the final date is: " + finaldate1);
    
    
}
}