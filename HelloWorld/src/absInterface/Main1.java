package absInterface;

public class Main1 implements MultipleInterface,MultipleInterface2 
{
	public void print() {
		System.out.println("hello");
	}
public void display()
{
	System.out.println("sum");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Main1 m=new Main1();
m.display();
m.print();

	}

}
