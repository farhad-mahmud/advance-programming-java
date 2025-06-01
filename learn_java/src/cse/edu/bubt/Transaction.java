import java.util.Scanner;

import java.util.ArrayList ;

public class Transaction {

    public static void main(String[] args) {

           String [] transactions = {"100", "-20" , "abs", "150" , "xyz" , "200"} ;

           int net_balance = 0 ;


           for(String i : transactions){

               try {

                    int amount = Integer.parseInt(i) ;

                    net_balance += amount ;


               }catch(NumberFormatException e){

                   System.out.println("Invalid amount skipped: " + i) ;

               }
           }

           System.out.println("Net balance: " + net_balance) ;



    }
}