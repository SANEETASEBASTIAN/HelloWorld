package hello;
import java.util.Scanner;
public class Square {
public int calArea(int side) {

	return side*side;

}
public static int getSide() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Side: ");
	int side=sc.nextInt();
	return side;

}
}
