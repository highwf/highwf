import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;



public class practise7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStream b;
		try {
			b = new FileInputStream("e:\\aa.txt");
			System.setIn(b);
			
			Scanner f=new Scanner(System.in);
			while(f.hasNext()){
				String dd=f.next();
			System.out.println(dd);}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
