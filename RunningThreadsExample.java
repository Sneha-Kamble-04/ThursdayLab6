package ThreadsEx;

public class RunningThreadsExample 
{
	public static void main(String[] args) {
        // Get all running threads
        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);

        // Display information about each thread
        System.out.println("List of running threads:");
        for (Thread thread : threads) {
            System.out.println("Thread Name: " + thread.getName() +
                               "\nThread ID: " + thread.getId() +
                               "\nThread State: " + thread.getState() +
                               "\n------------------------");
        }
    }

}
