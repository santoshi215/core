package basics;

import java.util.Scanner;

public class Fibonacie {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num,no1=0,no2=1,result;
		
		System.out.println("enter the  number upto display series:");
		num=sc.nextInt();
		
		System.out.print(no1+"	 "+no2);
		
		for(int i=0;i<=num;i++)
		{
			result=no1+no2;
			no1=no2;
			no2=result;
			System.out.print("	 "+result);
		}
		
	}

}
