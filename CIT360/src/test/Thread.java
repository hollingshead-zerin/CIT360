package test;


public class Thread {
	
	public static void main(String a[]) {
		
		 Task R1 = new Task( "Thread-1");
		 R1.start();
		 R1.run();
	      
	     Task R2 = new Task( "Thread-2");
	     R2.start();
	     R2.run();

}
}