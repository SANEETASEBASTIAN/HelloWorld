package polymorphism;

import java.util.Scanner;
public class Onseason extends  Offseason{
public void discount(double cost) {
	//.super.discount(c);
	double dis =cost*0.4;
	System.out.println("Onseason Got 40% of discount");
	System.out.println("discount price onseason"+dis);
	
	
}

public static void main(String args[]) {

	
	System.out.println("Enter the season onseason or offseason");
	Scanner sc=new Scanner(System.in);

	String a = sc.nextLine();
	if(a.toLowerCase().equals("offseason"))
	{
		Offseason s= new Offseason();
		s.discount(1000);
		
	} 
	else
	{
		Onseason o= new Onseason();
		  o.discount(1000);
		
	}
		
	
	
	
	
}

 
}
