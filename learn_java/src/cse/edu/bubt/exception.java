package cse.edu.bubt;

import java.util.InputMismatchException;
import java.util.Scanner;

// custom exception for insufficient tickets ;

class InsufficientTicketsException extends Exception {
    public InsufficientTicketsException(String message) {
        super(message);
    }
}

public class exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_tickets = 5;

        try {
            System.out.print("Enter number of tickets you want to book: ");
            int  requestedTickets = sc.nextInt(); // this can throw InputMismatchException

            if (requestedTickets > total_tickets) {
                throw new InsufficientTicketsException("Not enough tickets available!");
            } else if (requestedTickets <= 0) {
                System.out.println("Invalid ticket number. Must be at least 1.");
            } else {
                System.out.println("Booking confirmed for " + requestedTickets + " tickets.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
        } catch (InsufficientTicketsException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Exam sesh!!!") ;
        }
    }
}
