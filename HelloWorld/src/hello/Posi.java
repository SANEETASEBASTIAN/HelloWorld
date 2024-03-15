package hello;

import java.util.Scanner;

public class Posi {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the num");
     int a= sc.nextInt();
	if(a<=0)
	{
		System.out.println("negative");
	}
	else
		System.out.println("positive");
}
}
