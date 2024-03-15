package absInterface;

public class New2 implements NewInterface{

	public double sum() {
		
		int a=10,b=9;
		int sum =a+b;
		System.out.println(sum);
		return sum;
	}
	public static void main(String args[]) {
		NewInterface n=new New2();
		n.sum();
		
		System.out.println(MAX);
	}
}
