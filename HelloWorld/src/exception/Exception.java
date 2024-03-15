package exception;

public class Exception  {
	double a=10,b=12;
	public void addition() {
		System.out.println(a+b);
		
		
	}
	public void multiply() {
		System.out.println(a*b);
		
	}
	public void division() {
		System.out.println(a/b);
		System.out.println(b/a);
	
		
		System.out.println(a/10);
		System.out.println(b/10);
	try {
		
		System.out.println(a/0);
		}catch(ArithmeticException e) {
		 e.getMessage();
		}
		
	}
	public static void main(String args[]) {
		Exception e =new Exception();
		e.addition();
		e.division();
		e.multiply();
	}

}
