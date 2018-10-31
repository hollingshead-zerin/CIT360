
package threading;

public class WorkerThread implements Runnable {
  
    private String command;
    private int number;
    
    public WorkerThread(String s,int num){
        this.command=s;
        this.number=num;
    }

    @Override
    public void run() {
        int number2 = number * number;
    	//System.out.println(Thread.currentThread().getName()+"Num = " + number + ". Start. Command = "+command);
        System.out.println("Number " + number + " Squared = " + number2 + ". command = " +command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
}
