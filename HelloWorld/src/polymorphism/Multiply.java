package polymorphism;

public class Multiply extends Product  {
	
	 Multiply (){
		 super();
		 
	 }
	@Override
	public int findProduct(int n, int m) {
		
		super.findProduct(n,m);
		return n*m*100;
	}
	public static void main(String args[]) {
		
		Product m= new Multiply();
		
		System.out.println(m.findProduct(10, 20));
		
	}
	
	 
}
