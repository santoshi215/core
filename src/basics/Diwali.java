package basics;

import java.util.Scanner;

public class Diwali {

	@SuppressWarnings("resource")
	public static void input()
	{
		Scanner sc=new Scanner(System.in);
		
		int year;
		float sal;
		
		System.out.println("enter the year of experience of an employee:");
		year=sc.nextInt();
		System.out.println("enter the salary of an employee:");
		sal=sc.nextFloat();
		// TODO Auto-generated method stub

	
	
	if(year>5)
	{
		sal=(sal+((35/100)*sal));
		System.out.println("total salary of employee is:"+sal);
		
	}
	else
	{
		sal=(sal+((35/100)*sal));
		System.out.println("total salary of employee is:"+sal);
	}
}

}
