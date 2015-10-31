package practice1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d1 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		// long time =System.currentTimeMillis();
		// while(System.currentTimeMillis()-time<=2000){
		//
		// }
		//
		// Date date2=new Date();
		// System.out.println(date2.compareTo(date));

		// DateFormat dateFormat=DateFormat.getDateInstance();
		// System.out.println(dateFormat.format(date));
		//
		//
		// String pathString ="yyyy$MM$dd";
		// SimpleDateFormat a=new SimpleDateFormat(pathString);
		// System.out.println(a.format(date));

		// String string = "2015-08-13";
		//
		// String pathstring = "yyyy-MM-dd";
		// SimpleDateFormat a = new SimpleDateFormat(pathstring);
		// try {
		// Date date1 = a.parse(string);
		//
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		String a = "2015/08/15 14:02:00";
		String b = "yyyy/MM/dd HH:mm:ss";
		String c = "yyyy年MM月dd日 HH时mm分ss秒";
		SimpleDateFormat d = new SimpleDateFormat(b);
		SimpleDateFormat e = new SimpleDateFormat(c);
		try {
			Date date1 = d.parse(a);
			System.out.println(date1);
			System.out.println(e.format(date1));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date date1 = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		System.out.println(dateFormat.format(date1));

	}

}
