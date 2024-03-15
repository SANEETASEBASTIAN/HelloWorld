 package absInterface;

public class HDFC implements RBI {
	double interest=0.5;

@Override
public double recurringDeposit(int amount,int duration) {
	double intrestamount=amount*interest*duration;
	System.out.println("Intrest amount "+intrestamount);
	return amount*intrestamount;
	
	
	
		
	}
	

}
