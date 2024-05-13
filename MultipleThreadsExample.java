/*
 Q3. Write a program to display all running threads in Java
 */
package ThreadsEx;
public class MultipleThreadsExample 
{

    public static void main(String[] args)
    {
        // Create and start three threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread continues its work
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Main thread is running...");
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }

    static class MyRunnable implements Runnable 
    {
        @Override
        public void run() 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " is running...");
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

