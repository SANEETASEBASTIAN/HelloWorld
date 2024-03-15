package hierarchical;

//import inheritance1.Cube;

public class Female extends Gender {
	//public void girl() 
	Female(int a)
	{
		super(a);
		System.out.println("Girls ,Female, XX "+a);
	}
	public static void main(String args[]) {
		Female f= new Female(6);
		f.identity();

		//f.girl();
		
	}
}
