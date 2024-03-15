package polymorphism;

public class Addition  {
	static final int a=100;
	public void sum() {
		  int a=10;
				 int b=30;
		int sum=a+b;
		System.out.println("Sum is "+sum);
		
	}
	public void sum(int a , int b) {
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	public void sum(float a , float b) {
		float sum=a+b;
		System.out.println("Sum is "+sum);
	}
	public static void main(String args[]) {
		Addition a= new Addition();
		a.sum();
		a.sum(3,6);
		a.sum(9.7f,5.9f);
	}

}
