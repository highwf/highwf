import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class pract6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File a = new File("e:" + File.separatorChar + "aa.txt");
		try {
			RandomAccessFile b = new RandomAccessFile(a, "rw");
			String kk="fjskjfkjsk";
			byte [] ll=new byte[1024];
			b.write("dfd".getBytes());
			ll=kk.getBytes();
			b.write(ll);
			System.out.println(b.getFilePointer());
			b.seek(0);
			byte[] f = new byte[1024];
			int len;
			while((len=b.read())>0){
				System.out.println(new String(f,0,len));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
