package Examples;

public class Factorial {
	int n;
	int fact=1;
public  void fact(int n) {
	
	for(int i=1;i<=n;i++)
		fact=fact*i;
	display(); 
}
public  void display() {
	System.out.println("factorial of the number is "+fact);
}
public static void main(String args[]) {
	Factorial f=new Factorial();
	f.fact(5);
}
}

