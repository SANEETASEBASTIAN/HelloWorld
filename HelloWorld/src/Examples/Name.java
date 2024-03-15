package Examples;
 import java.util.Scanner;
public class Name {
	static String name;
	static int age;
	public static void details(String name, int age) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
	    name=sc.nextLine();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		
	}
	public static void display() {
		
		details(name,age);
		
	}
	public static void main(String args[]) {
		
      display();
		
	}
}
