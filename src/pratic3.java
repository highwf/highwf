import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class pratic3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File z = new File("e:" + File.separator+"aa.txt" );
		FileOutputStream x=null;
		try {
			 x = new FileOutputStream(z, true);
			String c = "sdfgh";
			byte[] v = c.getBytes();
			try {
				x.write(v);
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
