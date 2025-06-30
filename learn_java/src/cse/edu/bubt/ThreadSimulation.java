package cse.edu.bubt ;

import java.util.ArrayList ;
import java.util.List;
import java.util.Random ;

import java.util.concurrent.TimeUnit ;

public class ThreadSimulation {


    public static final List<Integer> shared_list = new ArrayList<>();
    // sharedlist to store generated numbers ;

    public static boolean running = true ;

    public static final Random random = new Random() ;
    // random number generator

    public static void main(String[] args) {

        Thread t1 = new Thread (()-> {

            while(running){

                 int num = random.nextInt(100) ;

                 synchronized(shared_list){

                     shared_list.add(num) ;
                     System.out.println("Generated : " + num) ;

                 }
                 try{

                     TimeUnit.SECONDS.sleep(1) ;

                 }
                 catch(InterruptedException e){

                       e.printStackTrace() ;
                 }
            }
        }) ;

        // now a new thread for summing the values ;

        Thread t_sum = new Thread (() ->{

            while(running){
                int sum = 0;

                synchronized(shared_list){

                    for(int num : shared_list)
                    {
                        sum += num ;
                    }

                    System.out.println("curr sum : " + sum) ;
                }
                try{

                    TimeUnit.SECONDS.sleep(1) ;


                }
                catch(InterruptedException e){
                    e.printStackTrace() ;
                }

            }
        }) ;

        t1.start() ;
        t_sum.start() ;

        // main thread will stop after 10 seconds ;

        try {
            TimeUnit.SECONDS.sleep(10) ;

        } catch(InterruptedException e){
             e.printStackTrace() ;
        }

        running = false ;

        System.out.println("Thread simulation finished") ;

    }
}