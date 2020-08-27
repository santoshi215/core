package basics;

import java.util.Scanner;

public class Special {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a char:");
		ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
				{
			System.out.println("entered character is an alphabet");
				}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("entered character is a digit");	
		}
		else
		{
			System.out.println("entered character is a special character");
			
		}

	}

}
