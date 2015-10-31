package xian;

public class wan extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			long time = System.currentTimeMillis();
			while (System.currentTimeMillis() - time < 2000) {

			}
			System.out.println(Thread.currentThread().getName()+"о╢ак"+(i+1));
		}
		}
}
