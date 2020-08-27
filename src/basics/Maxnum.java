package basics;

import java.util.Scanner;

public class Maxnum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number1:");
		num1=sc.nextInt();
		System.out.println("enter the number2:");
		num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("the maximum among numers is:"+num1+"the minimum number is:"+num2);
		}
		else
		{
			System.out.println("the maximum among numers is:"+num2+"the minimum number is:"+num2+"the minimum among numers is:"+num1);
		}
		
	}}

