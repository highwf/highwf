package picture;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		picture[] we = new picture[100];
		Scanner y = new Scanner(System.in);
		String hh = y.next();
		String[] jj = hh.split(",");
		for (int i = 0; i < jj.length; i++) {
			String gg[] = jj[i].split("//", 2);
			picture we1 = new picture(gg[1], jj[i]);
			we[i] = we1;
			we[i].start();
		}
	}
}
