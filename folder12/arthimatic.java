import java.time.LocalDate;

public class arthimatic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 8, 27); // Example input date

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Final Date: " + result);
    }
}
