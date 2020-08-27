package basics;

import java.util.Scanner;

public class Sum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,nums;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the first value:");
         num=sc.nextInt();
         
         System.out.println("Enter the second value:");
        
         nums=sc.nextInt();
         
         int sum = num+nums;
         
         System.out.println("sum of two numbers is:"+sum);
         
	}

}
