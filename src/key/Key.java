package key;

public class Key {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object l1=new Object();
		Object l2=new Object();
		Demo a=new Demo(l1,l2);
		Demo1 b=new Demo1(l1,l2); 
		a.start();
		b.start();
	}

}

class Demo extends Thread {

	Object l1;
	Object l2;

	public Demo(Object l1, Object l2) {
		this.l1=l1;
		this.l2=l2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (l1) {
			try {
				l1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("得到l1" );
			synchronized (l2) {
				System.out.println("得到l2");
			}
		}
	}
}
class Demo1 extends Thread {

	Object l1;
	Object l2;

	public Demo1(Object l1, Object l2) {
		this.l1=l1;
		this.l2=l2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (l2) {
			System.out.println("我得到  l2");
			synchronized (l1) {
				System.out.println("我得到l1");
				l1.notify();
			}
		}
	}
}
