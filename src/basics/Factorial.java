package basics;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1,i,num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the numer:");
		num=sc.nextInt();
/*
while(i<=num)
		{
			fact*=i;
			i++;
		}*/
		
		//using for loop
		for(i=1;i<=num;i++)
	{
			fact=fact*i;
		}
		System.out.println("factorial of given number is:"+fact);

	}

}
