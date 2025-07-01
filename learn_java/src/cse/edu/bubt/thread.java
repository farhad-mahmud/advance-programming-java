package cse.edu.bubt;

// creating thread by extending the thread class

class example1 extends Thread {

       public void run() {

           System.out.println("Thread is running") ;

       }

public static void main(String args[]) {

    example1 t1 = new example1();
    // t1 is a object of example1 class who extended the thread class
    t1.start();
}

}