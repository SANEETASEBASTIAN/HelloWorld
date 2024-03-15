package inheritance1;

public class Rectangle extends Shape {
public int area() {
	int l=3, b=10,h=13;
	int area=l*b*h;
	System.out.println("area ="+area);
	return area;
}
}
