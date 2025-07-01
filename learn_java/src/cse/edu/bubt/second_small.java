package cse.edu.bubt;
import java.util.Arrays ;

public class second_small {

    public static <T extends Comparable<T>> T find_second_small(T[] array){

        if(array.length < 2){
              throw new IllegalArgumentException ("Array is too small") ;

        }

        Arrays.sort(array) ;

        return array[1] ;

    }

    public static void main (String[] args) {
        Integer[] arr = {5 , 4 , 5, 8 ,1} ;
        System.out.println("second smallest int " + find_second_small(arr));


        Character[] arr_char = {'z', 'e', 'a', 'k', 'm'};
        System.out.println("Second smallest character: " + find_second_small(arr_char));


    }
}
