package piao1;

public class Piao implements Runnable {
	static int p = 10;
	static boolean e=false;

	@Override
	
	public void run() {
		// TODO Auto-generated method stub
			while (!e) {
				gett();
				
			}
	}
	public  synchronized void gett(){
		if (p > 0) {
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p--;
			System.out.println(Thread.currentThread().getName() + "¬Ú¡À"
					+ 1);

			System.out.println(" £" + p);

		} else {
			e=true;
			
		
		}
	}
}
