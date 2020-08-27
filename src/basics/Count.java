package basics;

import java.util.Scanner;

public class Count {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num;
		
		int count=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the numer:");
		num=sc.nextInt();
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}	
		System.out.println("number of digits in given number are:"+count);
	}

}
