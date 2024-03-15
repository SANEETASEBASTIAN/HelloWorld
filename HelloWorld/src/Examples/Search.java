package Examples;

public class Search {
public static void main(String args[]) {
	int a1[]= {1,2,3,5,6,7,8,9};
	int n=9;
	System.out.println(search(a1,n));
}
	public static int search(int a[],int n) {
		
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==n) 
	{
		return i;
	}
		
	}
	return -1;  
}
}
