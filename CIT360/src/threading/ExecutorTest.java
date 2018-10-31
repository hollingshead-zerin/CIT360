package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorTest {

		
	//here is a class that extends thread which will start a new thread when called.
	public static class Task2 extends Thread {
			
			@Override
			public void run() {
				System.out.println("Hello World");
			}
		}
	
	
		//here is the main method in this program. it holds all the calls to the different types of threads
		//this first one is an executor. The pool specifies how many threads to be able to run at the same time.
	    public static void main(String[] args) {
	        ExecutorService executor = Executors.newFixedThreadPool(5);
	        //make a loop that calls a new thread each time and pass the number to the workerThread class
	        for (int i = 0; i < 10; i++) {
	            Runnable worker = new WorkerThread("" + i, i );
	            executor.execute(worker);
	          }
	        //shuts down the threads
	        executor.shutdown();
	        while (!executor.isTerminated()) {
	        }
	        //prints that all the threads were completed.
	        System.out.println("Finished all threads");
	    
	        System.out.println("");


	     // calls the above class called task2
	     Thread myThread = new Task2();
	     myThread.start();
	
		
		// Task T1 = new Task( "Thread-1");
		// T1.start();
	     //Task T2 = new Task( "Thread-2");
	     //T2.start();
	

		// calls the class called runnableInf, passes the name of the thread
		 RunnableInf R1 = new RunnableInf( "Thread-1");
		 R1.start();
		
	      
	     RunnableInf R2 = new RunnableInf( "Thread-2");
	     R2.start();
	    
	    }
	
}

// https://www.codejava.net/java-core/concurrency/understanding-atomic-variables-in-java
// https://www.journaldev.com/1069/threadpoolexecutor-java-thread-pool-example-executorservice
// http://tutorials.jenkov.com/java-util-concurrent/executorservice.html