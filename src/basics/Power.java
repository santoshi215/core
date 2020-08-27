package basics;

import java.util.Scanner;

public class Power {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,power,result=1,i;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
		num=sc.nextInt();
		System.out.println("enter the power:");
		power=sc.nextInt();
		
		for(i=1;i<=power;i++)
		{
		result=result*num;
	}
		System.out.println("the result is:"+result);

}}
