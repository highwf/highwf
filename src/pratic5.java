import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pratic5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File a = new File("e:" + File.separator + "aa.txt");
		try {
			FileWriter b = new FileWriter(a);
			BufferedWriter c = new BufferedWriter(b);
			String d = "บรบร";
			c.write(d);
			c.flush();
			FileReader f=new FileReader(a);
			BufferedReader g=new BufferedReader(f);
			g.readLine();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
