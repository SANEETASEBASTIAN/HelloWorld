package Examples;

public class Customer {
	static int total;
public  static int total(int a, int b,int c) {
	
	int total=a+b+c;
	System.out.println("total"+total);
	return total;
	}


	public static void dicount() {
		
		if(total(450,800,4599)>5000) {
			
			System.out.println("discount get 20%");
		    
		}
		else
			System.out.println("not get");
		
	}
	
	public static void main(String args[]) {
		dicount();
	}
	
	
}

