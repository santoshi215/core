package basics;

import java.util.Scanner;

public class Cfarcelsius {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temprature;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter temprature in celsius:");
		temprature=sc.nextInt();
		
		
		double farhenhit =(temprature*1.8)+32;
		System.out.println("temprature converted celsius to farhenhit:"+farhenhit);
	
	System.out.println("enter temprature in farhenhit:");
	temprature=sc.nextInt();
	
	double celsius = ((5/9)*(32-temprature));
	
	System.out.println("temprature converted farhenhit to celsius:"+celsius);
	
	
	
	
	
	
	
	
	
		
		
	}

}
