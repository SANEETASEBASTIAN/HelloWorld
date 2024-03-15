 package singleInheritance;

public class Apple extends Fruits {
	String name="Applew";
	Apple(int a){
		System.out.println("Child class Constructor "+name);
	}
	Apple(){
		super();
		System.out.println("Child class Constructor........." +super.name);
	}
	public void getcost() {
		System.out.println("cost "+cost);
	}
}
