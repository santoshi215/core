package basics;

import java.util.Scanner;

public class Table {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			result=num*i;
			System.out.println(+result);
		}
		
	}

}
