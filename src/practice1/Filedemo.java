package practice1;

import java.io.File;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Filedemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File a=new File("e:"+File.separator+"aa");
		// a.mkdir();
		File f = new File("e:" + File.separator);
		cheak(f);
	}

	public static void cheak(File a) {
		if (a.isDirectory()) {
			File[] b = a.listFiles();
			if (b != null) {
				if (b.length == 0) {
					System.out.println(a);
				} else {
					for (int i = 0; i < b.length; i++) {
						// System.out.println(b[i]);
						cheak(b[i]);
					}
				}
			}

		} else {
			System.out.println(a);
		}
	}
}
