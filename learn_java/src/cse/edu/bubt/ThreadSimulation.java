// Import necessary classes for threading, random number generation, list operations and synchronization

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Import TimeUnit for sleep control

import java.util.concurrent.TimeUnit;

public class ThreadSimulation {

    // Shared list to store generated numbers

    private static final List<Integer> sharedList = new ArrayList<>();

    // Random number generator

    private static final Random random = new Random();

    public static void main(String[] args) {

        // Thread for generating random numbers every 1 second
        Thread generatorThread = new Thread(() -> {
            while (true) {
                int num = random.nextInt(100);  // Generate a random number between 0 and 99

                synchronized (sharedList) {  // Synchronize access to sharedList
                    sharedList.add(num);
                    System.out.println("Generated: " + num);
                }

                try {
                    TimeUnit.SECONDS.sleep(1);  // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        // Thread for summing the list values every 3 seconds
        Thread sumThread = new Thread(() -> {
            while (true) {
                int sum = 0;

                synchronized (sharedList) {  // Synchronize access to sharedList
                    for (int num : sharedList) {
                        sum += num;
                    }
                    System.out.println("Current Sum: " + sum);
                }

                try {
                    TimeUnit.SECONDS.sleep(3);  // Sleep for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        generatorThread.start();
        sumThread.start();
    }
}
