package basics;

import java.util.Scanner;

public class Grade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int phy,chem,math,bio,eng,totalmarks;
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter numbers scored in phy:");
	phy=sc.nextInt();
	System.out.println("enter numbers scored in chem:");
	chem=sc.nextInt();
	System.out.println("enter numbers scored in math:");
	math=sc.nextInt();
	System.out.println("enter numbers scored in bio:"); 
	bio=sc.nextInt();
	System.out.println("enter numbers scored in eng:");
	eng=sc.nextInt();
	System.out.println("totalmarks of all subject are:");
	totalmarks=sc.nextInt();
	
	int sum=(phy+chem+math+bio+eng);
	double percentage=((sum*100)/totalmarks);
	
	if(percentage>=90)
	{
		System.out.println("Grade A");
	}
	else if(percentage>=80)
	{
		System.out.println("Grade B");
	}
	else if(percentage>=70)
	{
	System.out.println("Grade C");
	}
	else if(percentage>=60)
	{
	System.out.println("Grade D");
	}
	else if(percentage>=40)
	{
    System.out.println("Grade E");
}
	else
	{
		System.out.println("fail");
	}
}
}