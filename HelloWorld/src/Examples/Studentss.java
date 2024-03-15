package Examples;

public class Studentss {
	String name;
	int rollnumber;
	 String batch;
	Studentss(String name,int rollnumber, String batch){
		this.name=name;
		this.rollnumber=rollnumber;
		this.batch=batch;
		System.out.println("name "+name);
		System.out.println("rollnumber "+rollnumber);
		System.out.println("batch "+batch);
		System.out.println();
		
	}
public static void main(String args[]) {
	Studentss s= new Studentss("saneeta",101,"b1");
	Studentss s2= new Studentss("Muhasina",11,"b1");
	Studentss s1= new Studentss("liza",102,"b2");
}
}
