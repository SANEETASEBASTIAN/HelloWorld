package hello;
import java.util.Scanner;
public class Sum {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first numbers:");
		int a=sc.nextInt();
		System.out.println("Enter the  Second numbers:");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum of the number "+a+"+"+b+"="+sum);
	}
}
