package piao;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("xĞÕÃû");
		Scanner m=new Scanner(System.in);
           
           String name=m.next();
           String [] s=name.split(",");
           for (int i = 0; i < s.length; i++) {
			
        	   if(s[i]!=null){
		
           Piao c=new Piao(s[i]);
           Thread b=new Thread(c);
           b.start();
        	   
		}
       
	} }
	
}
