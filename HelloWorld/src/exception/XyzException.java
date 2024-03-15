package exception;

public class XyzException {
	

		public static void main(String[] args)throws AbcException
		
		{
			XyzException obj=new XyzException();
			obj.display(21);
			
		}
		public void display( int a) throws AbcException
		{
			if (a<18)
			{
				throw new AbcException("hello");
				
				
			}
			else {
				try {
			
				
				System.out.println(" Elligible");
				}catch(AbcException v)
			{
					System.out.println(v);
			}

			}

		}
}


