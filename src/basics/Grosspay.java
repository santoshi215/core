package basics;

import java.util.Scanner;

public class Grosspay {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int salary;
		
		double HRA,DA,GrossSalary;
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter basic salary:");
		salary=sc.nextInt();
		
		if(salary<=10000)
		{
			HRA=(salary*20)/100;
			DA=(salary*80)/100;
			
			GrossSalary=salary+HRA+DA;
			System.out.println("Gross salary of 1employee is:"+GrossSalary);
		}
		
		else if(salary<=20000)
		{
			HRA=(salary*25)/100;
			DA=(salary*90)/100;
			
			GrossSalary=salary+HRA+DA;
			System.out.println("Gross salary of 2employee is:"+GrossSalary);
		}
		else
		{
			HRA=(salary*30)/100;
			DA=(salary*95)/100;
			
			GrossSalary=salary+HRA+DA;
			System.out.println("Gross salary of employee is:"+GrossSalary);
		}
		System.out.println("GROSS SALARY IS:"+GrossSalary);	
	}

}
