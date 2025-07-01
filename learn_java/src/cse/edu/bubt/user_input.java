package cse.edu.bubt;
import java.util.Scanner ;

public class user_input {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in) ;
          System.out.println("Enter the name of the user");
          String input = sc.nextLine() ;

          if(!input.equals(input.trim())){

              System.out.println("Invalid username") ;
          }
          else if(!input.equals(input.toLowerCase())){

              System.out.println("Invalid username") ;

          }
          else if (input.length() > 8 || input.length() < 5){
               System.out.println("Invalid username") ;
          }
          else {
                System.out.println("Valid username") ;
          }

    }
}
