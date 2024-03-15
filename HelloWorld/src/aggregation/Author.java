package aggregation;

public class Author {
	String authorname;
	String place;
	Book b;
	Author(String authorname,String place,Book b){
		this.authorname=authorname;
	    this.place=place;
	 this.b=b;
	}
public void print()
{
	System.out.println(b.age+" "+b.name);
	System.out.println(authorname+" "+place);
	
}
public static void main(String args[]) {
	Book b1=new Book("sanu",23);
	Author a=new Author("Ram C/O Anathi","Kunchithanny",b1); 
	a.print();
	 
	
	
	
}
}