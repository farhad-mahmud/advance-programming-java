
import java.util.concurrent.TimeUnit;

class myThread extends Thread {

    public void run () {   // run method

        for(int i=1;i<=5;i++){

            System.out.println("hello from thread " + i) ;
        }

        try{
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e){

            e.printStackTrace() ;
        }
    }
}

public class Thread  {

    public static void main(String[] args) {

        myThread t1 = new myThread() ;  // creating a thread object ;

        // main thread
        t1.start() ; // starts thread calls run method

        for(int i=1;i<=5;i++){

            System.out.println("hello from thread " + i) ;
            try{
                TimeUnit.SECONDS.sleep(1);
            }
            catch(InterruptedException e){

                e.printStackTrace() ;
            }

        }

    }

}