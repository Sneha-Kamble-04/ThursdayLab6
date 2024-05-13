/*
 Q2. Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.

 */
package ThreadsEx;
public class ProducerConsumerExample 
{
	public static void main(String[] args) 
	{
        // Shared object to represent the producer's factory
        ShirtFactory shirtFactory = new ShirtFactory();

        // One producer and five consumers
        Thread producerThread = new Thread(new Producer(shirtFactory), "Producer");
        Thread consumerThread1 = new Thread(new Consumer(shirtFactory, "Consumer 1"), "Consumer 1");
        Thread consumerThread2 = new Thread(new Consumer(shirtFactory, "Consumer 2"), "Consumer 2");
        Thread consumerThread3 = new Thread(new Consumer(shirtFactory, "Consumer 3"), "Consumer 3");
        Thread consumerThread4 = new Thread(new Consumer(shirtFactory, "Consumer 4"), "Consumer 4");
        Thread consumerThread5 = new Thread(new Consumer(shirtFactory, "Consumer 5"), "Consumer 5");


        // Start the threads
        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();
        consumerThread4.start();
        consumerThread5.start();

        try 
        {
            // Wait for all threads to finish
            producerThread.join();
            consumerThread1.join();
            consumerThread2.join();
            consumerThread3.join();
            consumerThread4.join();
            consumerThread5.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        // Display the remaining shirts in the factory after all operations
        int remainingShirts = shirtFactory.getRemainingShirts();
        System.out.println("Remaining shirts in the factory: " + remainingShirts);
    }

}
