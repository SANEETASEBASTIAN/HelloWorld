package singleInheritance;

public class Fruits  {

	public Fruits(){
		System.out.println("Parent class");
		
	}
	public Fruits(int a){
		System.out.println("Parent class Constructor");
	}
	public String name="Exotic fruits";
	protected int cost=100;
	private int a=34;
	static String varient="Apple";
	public void getName() {
		System.out.println("Parent class " +"name "+name+", "+"cost "+cost+" ,"+"varient "+varient);
	}
}
