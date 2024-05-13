/*
 Q4. Write a program to set the priorities of the thread.
 */
package ThreadsEx;
public class PriorityExample extends Thread   
{   
	// Method 1  
	// Whenever the start() method is called by a thread  
	// the run() method is invoked  
	public void run()  
	{  
		// the print statement  
		System.out.println("Inside the run() method");  
	}  
  // the main method  
public static void main(String argvs[])
	{  

	// creating a thread by creating an object of the class ThreadPriorityExample1  
	PriorityExample th1 = new PriorityExample(); 
	PriorityExample th2 = new PriorityExample();
	PriorityExample th3 = new PriorityExample();

	
	// Setting thread priorities using min & max functions
    th1.setPriority(Thread.MIN_PRIORITY); // Priority 1
    th2.setPriority(Thread.MAX_PRIORITY); // Priority 10
    th3.setPriority(7);
  
	// th1 thread is the child of the main thread  
	// therefore, the th1 thread also gets the priority 1  
  
	// Displaying the priority of the current thread  
	System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
	System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
	System.out.println("Priority of the thread th3 is : " + th3.getPriority());  


	}  
}
