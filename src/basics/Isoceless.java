package basics;

import java.util.Scanner;

public class Isoceless {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("enter side1:");
		
		int len,bredth,h;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter side1:");
		len=sc.nextInt();
		System.out.println("enter side2:");
		bredth=sc.nextInt();
		System.out.println("enter side3:");
		h=sc.nextInt();
		
		
		
		if(len==bredth  && bredth==h)
		{
			
				System.out.println("EQUILATERAL TRIANGLE");
			
		}
		else if(len==bredth && bredth !=h )
		{
			
				System.out.println("Isoceseless triangle");
			}
		
	
		else if(len != bredth  || bredth!=h  || h != len)
		
	{
		System.out.println("Sceleten triangle");
	}
	}
}
