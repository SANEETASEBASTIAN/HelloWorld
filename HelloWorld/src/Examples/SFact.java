
 package Examples;

public class SFact {
public static  void fact(int n ) {
	int fact=1;
	for(int i=1;i<=n;i++)
		fact=fact*i;
	System.out.println("factorial of the "+n+" is "+fact);
}
public static void main(String args[]) {
	
	
		SFact.fact(5);
	
}
}