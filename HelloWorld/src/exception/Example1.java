package exception;

public class Example1 {
	public void display(int a) throws InterruptedException{
		if(a%2==0) {
			System.out.println("even");
		}
	
	else
	{try {
	
		throw new EvenException("odd number");
	}catch(EvenException e) {
		System.out.println(e );
	}
	}
	}
public static void main(String args[])throws InterruptedException {
	Example1 e=new Example1();
	e.display(3);
}
}
