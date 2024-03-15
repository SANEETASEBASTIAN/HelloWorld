package Examples;

public class Palindrome {
int n;
	public int reverse(int num)
	{    n=num;
		int rem,rev=0;
		while(num>0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		System.out.println(rev);
	return rev;
		}
	public void display()
	{
		
		 if(reverse(121)==n)
		  {
		  System.out.println(" is a palindrome number ");
		  }
		  else
		  {
		  System.out.println(" is not a palindrome number");
		  }
		   

		 }
	
	public static void main(String args[]) {
		
		Palindrome p= new Palindrome();
		
		p.display();
	}
	}


