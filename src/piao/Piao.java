package piao;

public class Piao implements Runnable {
	String name;
       public Piao(String name1){
    	   name=name1;
       }
	
	
	
     static  int p = 10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true) {
			if(p>0){
			System.out.println(name + "ÂòÁË" + 1);
			p--;
			System.out.println("Ê£"+p);
				}else{
					break;
				}

			}
		}
	}

