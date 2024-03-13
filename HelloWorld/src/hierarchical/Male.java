package hierarchical;
import  singleInheritance.Fruits;

public class Male extends Gender {
	Male(){
		//super();
		System.out.println("child");
		
	}
	public void boy() {
		System.out.println("XY");
	}
public static void main(String args[]) {
	Fruits f =new Fruits(3);
	f.getName();
	
}
	
}



