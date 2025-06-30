
import java.util.Scanner;

public class StringNormalizer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");

        String s = sc.nextLine();  // the string input


        s = s.trim().replaceAll("\\s+", " ");

        // s.trim() removes leading and trailing spaces from string ;
        //  replaceALL("\\s+") replace 1+ spaces between words with exactly one space


        String[] words = s.split(" ");  // split string in words  ;


        StringBuilder normalizedString = new StringBuilder();


        for (String word : words) {
            if (word.length() > 0) {

                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                                    // capitalize first char of the word . + takes the res of the word and lowercase it
                normalizedString.append(capitalizedWord).append(" ");

            }
        }


        String result = normalizedString.toString().trim();
        // convert stringbuilder to string and trim extra space ;

        System.out.println("Normalized String: \"" + result + "\"");


        System.out.println("Word Count: " + words.length);


        sc.close();
    }
}
