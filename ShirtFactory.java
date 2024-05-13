package ThreadsEx;
import java.util.ArrayList;
import java.util.List;

/*
Q2. Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.

*/
public class ShirtFactory 
{
	private List<String> shirts = new ArrayList<>();

    // Produces 10,000 shirts
    public synchronized void produceShirts() 
    {
        for (int i = 1; i <= 10000; i++) 
        {
            shirts.add("Shirt " + i);
        }
        System.out.println("Producer produced 10,000 shirts.");
        notifyAll(); // Notify waiting consumers that new shirts are available
    }

    // Consumes a specified amount of shirts
    public synchronized void consumeShirts(int amount, String consumerName) 
    {
        try 
        {
            // Wait until there are enough shirts to consume
            while (shirts.size() < amount) 
            {
                System.out.println(consumerName + " is waiting for shirts.");
                wait();
            }

            // Consume the specified amount of shirts
            for (int i = 0; i < amount; i++) 
            {
                shirts.remove(0);
            }

            System.out.println(consumerName + " consumed " + amount + " shirts.");
            notifyAll(); // Notify the producer that some shirts have been consumed
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

    // Gets the remaining number of shirts in the factory
    public synchronized int getRemainingShirts() 
    {
        return shirts.size();
    }
}
