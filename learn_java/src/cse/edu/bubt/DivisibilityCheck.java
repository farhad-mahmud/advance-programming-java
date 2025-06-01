// Import necessary classes for list, random number generation and collections operations
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String[] args) {

        // Create a Scanner object for user input

        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Ask the user how many numbers to enter
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        // Take n numbers from the user and add to the list
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {

            numbers.add(sc.nextInt());

        }

        // Find the lowest number in the ArrayList using Collections.min()
        int lowest = Collections.min(numbers);

        System.out.println("Lowest number in the list: " + lowest);

        System.out.println("\nPairs whose sum is divisible by " + lowest + ":");

        // Loop through all pairs in the list
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {

                int sum = numbers.get(i) + numbers.get(j);

                // Check if sum of pair is divisible by lowest number
                if (sum % lowest == 0) {
                    System.out.println(numbers.get(i) + " + " + numbers.get(j) + " = " + sum);
                }
            }
        }

        // Close the scanner
        sc.close();
    }
}
