package Examples;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountBalanceMap {
	public static void main(String args[]) {
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();

		a=a.replace(" ","");
	char arr[]=a.toCharArray();
	int count=0;
	Map<Character,Integer>map=new TreeMap<Character,Integer>();
	for(int i=0;i<a.length();i++) {
		count=0;
		for(int j=0;j<a.length();j++) {
			
			if(arr[i]==arr[j])
			{count++;
				
			}
		} map.put(arr[i],count);
	}System.out.println(map);
}

}
