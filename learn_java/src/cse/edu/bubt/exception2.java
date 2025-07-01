package cse.edu.bubt ;
import java.util.Scanner;

// no custom exception is used here ;

public class exception2 {

    // Method to validate email address
    public static void validateEmail(String email) throws IllegalArgumentException, NullPointerException {
        if (email == null) {
            throw new NullPointerException("Email cannot be null!");
        }

        // Simple validation: must contain "@" and "."
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format!");
        }

        System.out.println("Email is valid: " + email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your email address: ");
            String email = sc.nextLine();  // take a string line input

            // Optional: if user just presses enter, treat it as null (simulate null case)
            if (email.trim().isEmpty()) {
                email = null;
            }
            // email.trim() removes all leading and trailing spaces from input ;
            // then .isEmpty checks if email is empty , if input was all spaces , it will
            // indicate that email is null , after removing all spaces ;


            validateEmail(email);

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            // Fallback catch block for any unexpected exceptions
            System.out.println("Something went wrong: " + e.getMessage());

        } finally {
            sc.close();
            System.out.println("Resource closed. Validation session ended.");
        }
    }
}
