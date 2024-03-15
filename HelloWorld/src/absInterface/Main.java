package absInterface;

public class Main {
	public static void main(String args[]) {
		RBI hdfc =new HDFC();
		double finalamount=hdfc.recurringDeposit(1000,2);
		System.out.println("Amount after deposting :"+finalamount);
		
		
	}

} 