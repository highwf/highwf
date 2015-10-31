package xian1;

public class Inteer extends Thread {
	volatile boolean stop =false;
     @Override
    public void run() {
    	 
    	// TODO Auto-generated method stub
    	 while(!stop){
//    	while(!Thread.currentThread().isInterrupted()){
    		System.out.println(Thread.currentThread().getName()+"≈‹");
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
//				Thread.currentThread().interrupt();
				
			}
    	}
    	System.out.println("Ω· ¯");
    }
}
