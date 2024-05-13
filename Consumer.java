/*
 Q2. Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.

 */
package ThreadsEx;
public class Consumer implements Runnable
{
	private final ShirtFactory shirtFactory;
    private final String consumerName;

    public Consumer(ShirtFactory shirtFactory, String consumerName)
    {
        this.shirtFactory = shirtFactory;
        this.consumerName = consumerName;
    }

    @Override
    public void run() 
    {
        // Each consumer takes a random amount of shirts (between 1 and 2000)
        int amountToConsume = (int) (Math.random() * 2000) + 1;
        shirtFactory.consumeShirts(amountToConsume, consumerName);
    }
}
