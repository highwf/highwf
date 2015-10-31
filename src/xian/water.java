package xian;

public class water extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		while (System.currentTimeMillis() - time < 10000) {
		}
		System.out.println("Ë®¿ªÁË");
	}
}
