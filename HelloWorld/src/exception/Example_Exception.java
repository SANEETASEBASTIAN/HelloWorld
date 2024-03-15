package exception;

public class Example_Exception {
	

		public static void main(String[] args) {
			try
			{int array[] =new int[10];
			array[20]=10;
			int a=1;
			int b= 0;
			int c= a/b;
			
			
			}
			catch(ArithmeticException d)
			{
				System.out.println("exception occured"+" "+d);
			}catch(ArrayIndexOutOfBoundsException a ) {
				System.out.println("exception occured"+" "+a);
			}
			finally
			{
			System.out.println("finished");	
			}
			}
}
