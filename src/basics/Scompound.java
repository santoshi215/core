package basics;

import java.util.Scanner;

public class Scompound {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t,n,p;
		double r,amount,CI;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of time :");
		t=sc.nextInt();
		System.out.println("enter the value of n :");
		n=sc.nextInt();
		System.out.println("enter the value of principle :");
		p=sc.nextInt();
		System.out.println("enter the value of roi :");
		r=sc.nextDouble();
		
		amount=p*Math.pow((1+r/n),n*t);
		CI=amount-p;
		
		System.out.println("compound interest is:"+CI);
		
		
		
		
		

	}

}
