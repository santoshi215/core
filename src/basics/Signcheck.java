package basics;

import java.util.Scanner;

public class Signcheck {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("the number is positive");
	    }
		else if(num<0)
		{
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("numer is zero");
		}
}}
