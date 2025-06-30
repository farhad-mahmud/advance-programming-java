package cse.edu.bubt ;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        String result = "";

        result = input.replaceAll("[aeiouAEIOU]", "") ;

        System.out.println("String after removing vowels: " + result);
        System.out.println("Length of result string: " + result.length());

        sc.close();
    }
}
