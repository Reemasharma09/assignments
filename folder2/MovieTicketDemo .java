class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }
    void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Sorry! Ticket already booked.");
        }
    }
    void displayDetails() {
        if (isBooked) {
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        } else {
            System.out.println("No ticket booked for movie: " + movieName);
        }
    }
}
public class MovieTicketDemo{
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        ticket1.displayDetails();
        System.out.println("\n--- Booking Ticket ---");
        ticket1.bookTicket(12, 250.0);
        System.out.println("\nTicket Details After Booking:");
        ticket1.displayDetails();
        System.out.println("\nTrying to Book Again");
        ticket1.bookTicket(15, 300.0);
    }
}