package basics;

import java.util.Scanner;

public class Digitsum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;

int sum=0,rem=0;

Scanner sc=new Scanner(System.in);

System.out.println("enter the number:");
num=sc.nextInt();

while(num>0)
{
	//to find out rem
	rem=num%10;
	//add remainder into sum
	sum=sum+rem;
	//change value of number varieble
	num=num/10;
}
System.out.println("the sumof digits is:"+sum);

	}

}
