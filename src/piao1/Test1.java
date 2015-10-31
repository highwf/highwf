package piao1;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("xĞÕÃû");
		Scanner m = new Scanner(System.in);
		Piao c = new Piao();

		String name = m.next();
		String[] s = name.split(",");
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {

				Thread b = new Thread(c);
				b.setName(s[i]);
				b.start();

			}
		}

	}
}
