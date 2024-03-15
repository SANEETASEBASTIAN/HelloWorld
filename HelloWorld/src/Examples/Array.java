package Examples;

public class Array {
public static void main( String args[]) {
	int a[]= {100,2000,3000,4000};
	int a1[]= {1,2,3,4,5};
	for (int i=0;i<a.length;i++) {
		System.out.println("Array elements are "+a[i]+" ");
		 
	}
	System.out.println();
	for(int y:a1)
	{
//System.out.println("Array elents");
		System.out.print(y+" ");
	}
}
}
