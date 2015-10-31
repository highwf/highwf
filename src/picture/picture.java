package picture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class picture extends Thread {
	String path;
	String pa;

	public picture(String path, String pa) {
		this.path = path;
		this.pa = pa;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ¸´ÖÆ¶àÕÅÍ¼Æ¬

		File a = new File(pa);

		File m = new File("f:\\" + path);
               System.out.println(path);
		FileInputStream b = null;
		FileOutputStream n = null;
		BufferedInputStream fw = null;
		BufferedOutputStream fw1 = null;

		try {
			b = new FileInputStream(a);
			fw = new BufferedInputStream(b);
			n = new FileOutputStream(m);
			fw1 = new BufferedOutputStream(n);
			byte [] nn=new byte[111];
			int len;
			while( (len=fw.read(nn))>0){
				fw1.write(nn);
			}
			fw1.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
