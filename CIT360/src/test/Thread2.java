package test;


public class Thread2 {
	
	public static void main(String a[]) {
		
		 Task R1 = new Task( "Thread-1");
		 R1.start();
		
	      
	     Task R2 = new Task( "Thread-2");
	     R2.start();
	    

}
}