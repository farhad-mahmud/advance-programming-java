package cse.edu.bubt;


class my_thread extends Thread {

       public void run(){

           for(int i=1;i<=5;i++){

               System.out.println(" my Thread ");

               try{
                    Thread.sleep(5000) ;
               }
               catch(InterruptedException e){
                    e.printStackTrace() ;
               }
           }
       }
}

public class thread {
      public static void main(String[] args) {

          my_thread t1 = new my_thread() ;
          t1.start() ;

          for(int i=1;i<=5;i++){

              System.out.println("main Thread ");

              try{
                   Thread.sleep(5000) ;

              }
              catch(InterruptedException e){
                   e.printStackTrace() ;

              }
          }
      }
}