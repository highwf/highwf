import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;


public class pratise4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File a= new File("e:"+File.separator+"ff.txt");
		 FileInputStream b;
		 FileOutputStream d;
		try {
			b = new FileInputStream(a);
			d= new FileOutputStream(a);
			StringBuffer m=new StringBuffer();
			for (int i = 0; i < 1024; i++) {
				m.append("i="+i).append("\t");
				
			}
			byte[] o=m.toString().getBytes();
			try {
				d.write(o);
				d.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedInputStream c =new BufferedInputStream(b);
			byte[] n=new byte[1024];
			try {
				while(c.read(n)>0){
				System.out.println(new String (n));}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
