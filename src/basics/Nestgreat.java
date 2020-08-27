package basics;

import java.util.Scanner;

public class Nestgreat {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1:");
		num1=sc.nextInt();
		System.out.println("enter num2:");
		num2=sc.nextInt();
		System.out.println("enter num3:");
		num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("greatest among three is:"+num1);
			}
		}
		else
			System.out.println("bye");
	}

}
