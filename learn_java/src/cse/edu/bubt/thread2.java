package cse.edu.bubt;

import java.util.concurrent.TimeUnit;

public class thread2 {


    public static boolean running = true;

    public static void main(String[] args) {

        Runnable robot_task = () -> {
         // a runnable thread named robot_task ;

            while (running) {
                for (int i = 10; i <= 15; i++) {
                    System.out.println(" placing part: " + i);
                    try {
                        Thread.sleep(500); // short delay to simulate processing
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread robot1 = new Thread(robot_task);
        Thread robot2 = new Thread(robot_task);
        Thread robot3 = new Thread(robot_task);


        robot1.start();
        robot2.start();
        robot3.start();

         // stop the program after 5 seconds ( optional code )  ;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        running = false;

        System.out.println("Assembly line simulation finished.");
    }
}
