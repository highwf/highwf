import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class practise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {// ∏¥÷∆∂‡’≈Õº∆¨
		// TODO Auto-generated method stub
		Scanner y = new Scanner(System.in);
		String hh = y.next();
		String[] jj = hh.split(",");

		for (int i = 0; i < jj.length; i++) {

			File a = new File(jj[i]);
			System.out.println(a);
			String gg[] = jj[i].split("//", 2);

			File m = new File("f:\\" + gg[1]);
			FileInputStream b = null;
			FileOutputStream n = null;
			BufferedInputStream fw = null;
			BufferedOutputStream fw1 = null;
			try {
				b = new FileInputStream(a);
				fw = new BufferedInputStream(b);
				n = new FileOutputStream(m);
				fw1 = new BufferedOutputStream(n);
				byte[] c = new byte[9999999];
				fw.read(c);
				try {

					while ((b.read(c)) > 0) {
						n.write(c);
						// System.out.println(new String(c));
					}
					n.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try {
					b.close();
					n.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
