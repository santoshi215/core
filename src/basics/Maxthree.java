package basics;

import java.util.Scanner;

public class Maxthree {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,no3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		no1=sc.nextInt();
		System.out.println("enter the second number");
		no2=sc.nextInt();
		System.out.println("enter the third number");
		no3=sc.nextInt();
		
		if(no1>no2 && no1>no3)
		{
			System.out.println("greatest number among three is:"+no1);
		}
		else if(no2>no3 && no2>no1)
		{
			System.out.println("greatest number among three is:"+no2);
		}
		else if(no3>no1 && no3>no2)
		{
			System.out.println("greatest number among three is:"+no3);
		}
	}
}
