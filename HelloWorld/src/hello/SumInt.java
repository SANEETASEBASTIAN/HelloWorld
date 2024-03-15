package hello;

import java.util.Scanner;

public class SumInt {
	public int sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("the sum of two number is "+a+"+"+b);
		return sum;
	}
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first num");
	     int a= sc.nextInt();
		System.out.println("enter the second num");
		 int b= sc.nextInt();
		 SumInt si= new SumInt();
		 System.out.println(si.sum(a,b));
			}
	}



