package exception;

public class CheckEligibility {
public void validateAge(int age) throws InterruptedException {
	if(age>=18) {
		System.out.println("eligible");
		System.out.println("Welcome");
	
	}else {
		throw new ArithmeticException("age less than 18");
		
	}
}
public static void main(String args[])throws InterruptedException{
	CheckEligibility c=new CheckEligibility();
	System.out.println("validate age");
	try {
		c.validateAge(0);
	}catch(ArithmeticException e) 
	{
		System.out.println(e);
	}

	
	System.out.println("rest of code");
}
}
