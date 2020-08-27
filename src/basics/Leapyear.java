package basics;

import java.util.Scanner;

public class Leapyear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the yaer:");
year=sc.nextInt();

if(year%4==0||year%100==0)
{	
     if(year%100==0)
{
				if(year%400==0)
				{
					System.out.println("entered year is leap year:"+year);
				}
}
}
else
{
	System.out.println("entered year is not a leap year:"+year);
}
}
}