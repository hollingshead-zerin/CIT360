package threading;



public class RunnableInf implements Runnable {
	   private Thread t;
	   private String threadName;
	   
	   RunnableInf (String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	      
	   }
	  
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	           try {
	        	  Thread.sleep(50);
	           } catch (InterruptedException e) {
	        	   System.out.println("Thread has been interrupted");
	           }
	         }
	      }	
	         finally {
	      System.out.println("Thread " +  threadName + " exiting.");
	         }
	    }
	      
   
	   public void start() {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	    	   t = new Thread(this, threadName);
	    	   t.start();
	      }
	   }
	}

//https://www.guru99.com/multithreading-java.html
