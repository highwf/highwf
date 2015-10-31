import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class p8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream a = System.in;
		PrintStream b = System.out;
		BufferedReader c = new BufferedReader(new InputStreamReader(a));
		BufferedWriter d = new BufferedWriter(new OutputStreamWriter(b));
		String len;
		try {
			while ((len = c.readLine()) != null) {
				d.write(len.toUpperCase());
				d.newLine();
				d.flush();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("e:"
					+ File.separatorChar + "aa.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
					fileOutputStream);
			DataOutputStream dataOutputStream=new DataOutputStream(bufferedOutputStream);
			dataOutputStream.writeUTF("dada1331我市积极到底"); //utf
			dataOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
