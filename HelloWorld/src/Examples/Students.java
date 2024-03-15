package Examples;

import java.util.Scanner;


public class Students {
	static long total;
      // String grade;
	
	public  Students(long a, long b, long c) {
		//this.total=0
	        total=a+b+c;
		if(total>250) {
			System.out.println("A");
		}
		
			else if (total<=250 && total>=150) {
				System.out.println("B");
		
				}
			else 
				System.out.println("fail");
	}
public static void main (String args[]){
	
      
      System.out.println("Sathosh"); 
	Students sc=new Students(80,46,37);
	System.out.println("total mark "+total);
	 System.out.println("Satheesh"); 
		Students s=new Students(80,46,87);
		System.out.println("total mark: "+total);
	
	
}
}
