package Examples;

public class AddArray {
	public static void main(String args[]) {
		int a[][]= {{1,2,6},{2,4,8},{4,6,8}};
		int b[][]= {{1,6,9},{5,7,4},{8,9,6}};
		
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		  
	}

}
