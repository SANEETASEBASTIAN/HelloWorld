package inheritance1;

public class Cube extends Rectangle {
	public void volume(){
		int s=7;
		int volume=s*s*s;
		System.out.println("Volume of cube is "+volume);
	}
	public static void main(String args[]) {
		Cube c= new Cube();
		c.volume();
		c.area();
		c.getSide();
	}
}
                         