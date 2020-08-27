package basics;

import java.util.Scanner;

public class Sdivide {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,num2,result;
        
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter the num1value:");
        num1=sc.nextInt();
        System.out.println("enter the num2value:");
        num2=sc.nextInt();
        
        result=num1/num2;
        System.out.println("division of two numbers is:"+result);
        
       
        
	}

}
