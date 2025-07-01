package cse.edu.bubt;
import java.util.Scanner ;
import java.util.* ;

public class hashmap {
    public static void main(String args[]){

          Scanner sc = new Scanner(System.in) ;
          System.out.println("Enter the string : ") ;
          String input = sc.nextLine() ;

          String[] words = input.split(" ") ;

          List <String > word_list = new ArrayList<>() ;
          // creating a list of to store words ;

        for(String word : words){

               word_list.add(word) ;

        }

          HashMap <String ,Integer> freq = new HashMap<>() ;

          for(String word : word_list){

               if(freq.containsKey(word)){

                   //checks if freq hashmap already has  this word as a key ;

                     freq.put(word,freq.get(word)+1) ;
                     // freq.get(word) fetches the current count of that word
                   // +1 , increases the count by one

                   // freq.put(word ,newcount) updates the value of that key with that count

               }
               else {

                    freq.put(word,1) ;
                    // if the word doesnt exist in freq ,
                   // adds the word as a new key in the hashmap


               }
          }

           for(String word : freq.keySet()){
               // loop through freq keyset ;

                System.out.println(word + " = " + freq.get(word)) ;
           }

           sc.close() ;
    }
}
