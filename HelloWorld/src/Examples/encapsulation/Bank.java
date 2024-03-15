package Examples.encapsulation;

import java.util.Scanner;

public class Bank {
private User user;
public void map() {
	System.out.println("Enter the vaild pin from 1001,1234,1212");
}
public static void main(String args[]) {
	
	System.out.println("Enter the vaild pin from 1001,1234,1212");
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	User u=new User();

	u.setPin(a);
	
	if(u.getPin()==(1001)||u.getPin()==(1234)||u.getPin()==(1212)){
		System.out.println("Valid pin");
		
	}
	Bank b= new Bank();
	
	
	b.map();
	/*switch(a) {
	case 1001: 
		System.out.println("Valid pin");
		break;
	case 1234: 
		System.out.println("Valid pin");
		break;
	case 1212: 
		System.out.println("Valid pin");
		break;	
		default:
			System.out.println("InValid pin");
		
	}/*
/*	if(u.getPin()==(1001)){
		System.out.println("Valid pin");
	}
		else if(u.getPin()==(1234)) {

			System.out.println("Valid pin");
		}
		else if(u.getPin()==(1212)) {
			
			
			System.out.println("Valid pin");
		}
		else
		{
			System.out.println("InValid pin");
		}
	*/
	
	}
	

	}



