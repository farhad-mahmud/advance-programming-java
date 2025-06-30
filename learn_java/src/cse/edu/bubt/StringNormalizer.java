
import java.util.Scanner;

public class StringNormalizer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");

        String s = sc.nextLine();


        s = s.trim().replaceAll("\\s+", " ");


        String[] words = s.split(" ");


        StringBuilder normalizedString = new StringBuilder();


        for (String word : words) {
            if (word.length() > 0) {

                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

                normalizedString.append(capitalizedWord).append(" ");

            }
        }


        String result = normalizedString.toString().trim();

        System.out.println("Normalized String: \"" + result + "\"");


        System.out.println("Word Count: " + words.length);


        sc.close();
    }
}
