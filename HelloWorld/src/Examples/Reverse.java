package Examples;

public class Reverse {

		int num,rev=0;
		 Reverse(int num){
		
			this.num=num;
			int rem;
			while(num>0)
			{
			rem=num%10;
			rev=rev*10+rem; 
			num=num/10;
			}
			
		
			}
	
		 Reverse(){
		this(124);
			System.out.println("The reverse of the number is "+rev);
		}
	
		
		public static void main (String args[]){
		Reverse r =new Reverse();
		}
		}

