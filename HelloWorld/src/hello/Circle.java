package hello;

public class Circle {
	public static void main(String args[]) {
	int radious=Square.getSide();
	Square sq=new Square();
	
	double area=3.14*sq.calArea(radious);
	System.out.println("area of the circle: "+area);
}

}
 