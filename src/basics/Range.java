package basics;

import java.util.Scanner;

public class Range {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,no2,res;
		Scanner sc=new Scanner(System.in);
		 	
			System.out.println("enter the first number of the range:");
			num=sc.nextInt();
			System.out.println("enter the second number of the range:");
			no2=sc.nextInt();
			
			System.out.println("display the even number between "+num+"and"+no2);
			
			for(int i=num;i<=no2;i++)
			{
				res=i%2;
				if(res==0)
				{
					System.out.println(i);
				}
			}
			
			System.out.println("display the odd number between "+num+"and"+no2);
			
			for(int i=num;i<=no2;i++)
			{
			 res=i%2;
			 if(res==1)
			 {
				 System.out.println(i);
			 }
			}
			
			
			}
			
		}
		
		
	


