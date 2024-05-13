/*
 Q2. Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.

 */
package ThreadsEx;
public class Producer implements Runnable
{
	private final ShirtFactory shirtFactory;

    public Producer(ShirtFactory shirtFactory) 
    {
        this.shirtFactory = shirtFactory;
    }

    @Override
    public void run() 
    {
        shirtFactory.produceShirts();
    }

}
