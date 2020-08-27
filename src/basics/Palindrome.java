package basics;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,org,rem,rev=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		org=num;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(rev==org)
		{
			System.out.println("entered number is palindrome");
		}
		else
		{
			System.out.println("the number is not a palindrome");
		}
	}
	
	
	

}
