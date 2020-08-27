package basics;

import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,num2;
char opr;
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the value of num:");
 num=sc.nextInt();
 System.out.println("Enter the value of num2:");
 num2=sc.nextInt();
 System.out.println("Enter an operator:");
 opr=sc.next().charAt(0);
 
 
 
 switch(opr)
 {
 case '+' : System.out.println("addition is:"+(num+num2));            
 break;
 case '-' : System.out.println("substraction is:"+(num-num2));            
 break;
 case '*' : System.out.println("multipliction is:"+(num*num2));            
 break;
 case '/' : System.out.println("division is:"+(num/num2));            
 break;
 default:  System.out.println("invalid choice");            
 break;
 }
 
System.out.println("byee");
	}

}
