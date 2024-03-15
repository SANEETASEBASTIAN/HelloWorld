package Examples;

public class Voting {
public static boolean vote(int a){
	return a>=18;
	
}
public static void main(String args[]) {
	 
if(vote(12))
		
		System.out.println("eligible"); 
	else {
		System.out.println(" not eligible");}
vote(18);
}
}
