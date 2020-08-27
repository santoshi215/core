package basics;

import java.util.Scanner;

public class Week {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of your choice:");
		n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("day is monday");
		}
		else if(n==2)
		{
			System.out.println("day is tuesday");
		}
		else if(n==3)
		{
			System.out.println("day is wednesday");
		}
		else if(n==4)
		{
			System.out.println("day is thursday");
		}
		else if(n==5)
		{
			System.out.println("day is friday");
		}
		else if(n==6)
		{
			System.out.println("day is saturday");
		}
		else if(n==7)
		{
			System.out.println("day is sunday");
		}
		else 
		{
            System.out.println("please enter numbers from 1-7");
	}
	}
}
