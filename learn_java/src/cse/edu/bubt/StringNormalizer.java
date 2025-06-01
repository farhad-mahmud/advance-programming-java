// Import Scanner class from java.util package for taking user input
import java.util.Scanner;

public class StringNormalizer {

    public static void main(String[] args) {
        // Create a Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        String s = sc.nextLine();

        // Trim leading and trailing spaces and replace multiple spaces between words with a single space
        s = s.trim().replaceAll("\\s+", " ");

        // Split the string into words using space as delimiter
        String[] words = s.split(" ");   // extract words ;

        // Use StringBuilder to build the normalized string efficiently
        StringBuilder normalizedString = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter, add rest in lowercase
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                // Append the word to the normalized string with a space
                normalizedString.append(capitalizedWord).append(" ");

            }
        }

        // Trim the final result to remove any trailing space
        String result = normalizedString.toString().trim();

        // Display the normalized string
        System.out.println("Normalized String: \"" + result + "\"");

        // Display the word count
        System.out.println("Word Count: " + words.length);

        // Close the scanner
        sc.close();
    }
}
