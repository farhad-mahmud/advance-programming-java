package cse.edu.bubt;
import java.util.Scanner ;
import java.util.ArrayList;
import java.util.Collections ;

public class divisible {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in) ;

           System.out.println("Size of the arraylist : ");
           int n = sc.nextInt() ;

           ArrayList<Integer> numbers = new ArrayList<>() ;

           for(int i =0 ; i< n ;i++) {
               numbers.add(sc.nextInt());    // take array inputs
           }

          int lowest = Collections.min(numbers) ;

           System.out.println("The lowest number is : " + lowest) ;


           for(int i= 0 ;i < numbers.size() ; i++){
                for(int j =i  ;j< numbers.size() ; j++){
                     int sum = 0 ;

                     sum = numbers.get(i) + numbers.get(j) ;

                      if(sum % lowest == 0) {

                          System.out.println("Pair (i,j): " + numbers.get(i) + " " + numbers.get(j)) ;

                          System.out.println("The sum : " + sum + " is divisible by " + lowest);

                      }

                }
           }
             sc.close() ;
    }
}
