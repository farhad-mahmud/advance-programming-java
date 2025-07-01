package cse.edu.bubt;
import java.util.Scanner ;
import java.util.ArrayList ;

public class valid_integer {

    public static void  main(String args[] ){

          Scanner sc = new Scanner(System.in) ;

          System.out.println("Enter the string : ")  ;

           String line = sc.nextLine() ; // took the whole string

           String[] transactions = line.split("\\s+") ; // this creates array of strings

           ArrayList<Integer> number_list = new ArrayList<>() ;

           for(String t : transactions){
                try{

                    int num = Integer.parseInt(t) ;

                    // converts each string to int and throws exception at the same time if invalid

                    number_list.add(num) ;   // store valid integers in arraylist called number_list ;

                }
                catch(NumberFormatException e) {
                    System.out.println("'" + t + "' : " +  "is Not a number");
                }
           }

           int sum = 0 ;

           for(int i : number_list){

                  sum += i ;
           }


           System.out.println("The sum of valid transactions : " + sum ) ;



    }
}
