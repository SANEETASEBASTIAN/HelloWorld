package reverse;

//import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		String a="hello how are you";
		//System.out.println("Enter the String");
		//Scanner sc=new Scanner(System.in);
		//String a=sc.nextLine();
	 
		reverseString(a);
	}
		 public static void reverseString(String a)
		 {
			int length=a.length();
		String	reverseString="";
			for(int i=length-1;i>=0;i--) {
				
				reverseString+=a.charAt(i);
				
				
			}
			System.out.println(reverseString);
		 }
		 
			
		}
		
	


