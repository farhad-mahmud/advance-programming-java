package cse.edu.bubt;
import java.util.Scanner ;
import java.util.LinkedList;
import java.util.Collections ;

public class linked_list {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;

         LinkedList<Integer> numbers = new LinkedList<>() ;

         int n = sc.nextInt() ;

         for(int i =0 ;i<n;i++){
               int num = sc.nextInt() ;
               numbers.add(num) ;

         }

         int min_val = Collections.min(numbers) ;

         System.out.println("min value" + min_val ;

     }
}
