package xian1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inteer a = new Inteer();
		a.setName("sda");
		System.out.println("������ʼ");
		a.start();
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����ж�");
//		a.interrupt();
		a.stop=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			Thread.currentThread().interrupt();
			
			
		}
		System.out.println("��������");
	}

}
