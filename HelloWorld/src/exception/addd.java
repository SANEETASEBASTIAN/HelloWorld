package exception;

public class addd {
	

	
		public void display(int age)
		{
			
			if(age<18) {
				throw new ArithmeticException("hallo");
			}
 
			else {
				System.out.println("eli");
			}
			
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			addd obj= new addd();
			obj.display(20);
		}

}
